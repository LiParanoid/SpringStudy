package com.paranoid.service;

import com.paranoid.dao.UserDao;

public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
