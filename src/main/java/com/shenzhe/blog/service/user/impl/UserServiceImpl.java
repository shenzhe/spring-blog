package com.shenzhe.blog.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shenzhe.blog.common.Helper;
import com.shenzhe.blog.dao.UserDao;
import com.shenzhe.blog.entity.User;
import com.shenzhe.blog.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service(value = "UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Resource
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public PageInfo<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userDao.selectUsers();
        PageInfo result = new PageInfo(users);
        return result;
    }

    @Override
    public User getOne(int id) {

        User user = userDao.getOne(id);
        return user;
    }
}
