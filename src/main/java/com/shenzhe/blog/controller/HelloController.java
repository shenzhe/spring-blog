package com.shenzhe.blog.controller;

import com.shenzhe.blog.common.RedisUtil;
import com.shenzhe.blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Component
public class HelloController {

    @Value("${spring.datasource.name}")
    private String title;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private ValueOperations<String, Object> valueOperations;

    @Resource
    private RedisUtil redisUtil;


    @RequestMapping("/")
    public String index() {
        return "Hello World!!!";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "i'm hello";
    }

    @RequestMapping("/user")
    public User user() {
        User user = new User();
        user.setId(1);
        user.setName(title);
        user.setPassword("123456");
        return user;
    }

    @GetMapping("/set")
    public String set(@RequestParam(name = "key", required = true)
                              String key,
    @RequestParam(name = "val", required = true)
                              String value) {
        valueOperations.set(key, value);
        return "OK";
    }

    @GetMapping("/get")
    public Object get(
            @RequestParam(name = "key", required = true)
                    String key
    ) {
        return valueOperations.get(key);
    }

}
