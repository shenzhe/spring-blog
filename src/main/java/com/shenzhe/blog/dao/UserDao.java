package com.shenzhe.blog.dao;

import com.shenzhe.blog.entity.User;
import java.util.List;

public interface UserDao {
    int insert (User user);

    List<User> selectUsers();

    User getOne(int id);
}
