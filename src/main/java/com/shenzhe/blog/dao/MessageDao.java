package com.shenzhe.blog.dao;

import com.shenzhe.blog.entity.Message;

public interface MessageDao {

    Message getStatus(Long taskId);
}
