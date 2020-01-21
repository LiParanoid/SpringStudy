package com.paranoid.service.impl;

import com.paranoid.dao.UserDao;
import com.paranoid.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
