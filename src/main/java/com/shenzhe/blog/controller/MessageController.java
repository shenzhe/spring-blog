package com.shenzhe.blog.controller;

import com.shenzhe.blog.entity.User;
import com.shenzhe.blog.req.StatusReq;
import com.shenzhe.blog.service.user.MessageService;
import com.shenzhe.blog.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;

@RestController
@Component
public class MessageController {

    @Autowired
    private MessageService messageService;


    @PostMapping("/status")
    public HashMap getStatus(@Valid @RequestBody StatusReq statusReq) {
        Integer status =  messageService.getStatus(statusReq);
        HashMap ret = new HashMap();
        HashMap head = new HashMap();
        head.put("code", 0);
        head.put("message", "");
        HashMap body = new HashMap();
        body.put("status", status);
        body.put("task_id", statusReq.getTaskId());
        ret.put("head", head);
        ret.put("body", body);
        return ret;
    }


}
