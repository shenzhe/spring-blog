package com.shenzhe.blog.controller;

import com.shenzhe.blog.entity.User;
import com.shenzhe.blog.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public int addUser(User user) {
        int ret = userService.addUser(user);
        if (1 == ret) {
            return user.getId();
        }
        return 0;
    }

    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize) {
        return userService.findAllUser(pageNum, pageSize);
    }

    @GetMapping("/{id:\\d+}")
    public User getOne(
            @PathVariable int id
    ) {
        return userService.getOne(id);
    }


}
