package com.paranoid.dao.impl;

import com.paranoid.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("默认获取Oracle用户的数据");
    }
}
