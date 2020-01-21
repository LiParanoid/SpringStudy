package com.paranoid.service.impl;

import com.paranoid.dao.UserDao;
import com.paranoid.dao.impl.UserDaoImpl;
import com.paranoid.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
