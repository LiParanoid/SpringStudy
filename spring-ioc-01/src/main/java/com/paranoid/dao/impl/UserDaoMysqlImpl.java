package com.paranoid.dao.impl;

import com.paranoid.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("默认获取Mysql用户的数据");
    }
}
