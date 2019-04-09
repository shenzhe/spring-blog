package com.shenzhe.blog.service.user;


import com.shenzhe.blog.req.StatusReq;

public interface MessageService {
    Integer getStatus(StatusReq statusReq);
}

