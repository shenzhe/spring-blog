package com.shenzhe.blog.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shenzhe.blog.dao.MessageDao;
import com.shenzhe.blog.entity.Message;
import com.shenzhe.blog.req.StatusReq;
import com.shenzhe.blog.service.user.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service(value = "MessageService")
public class MessageServiceImpl implements MessageService {
    @Autowired
    @Resource
    private MessageDao messageDao;

    @Override
    public Integer getStatus(StatusReq statusReq) {

        Message message = messageDao.getStatus(statusReq.getTaskId());
        return message.getStatus();
    }
}
