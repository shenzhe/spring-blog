package com.shenzhe.blog.service.user;

import com.shenzhe.blog.entity.User;
import com.github.pagehelper.PageInfo;


public interface UserService {
    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);

    User getOne(int id);
}

