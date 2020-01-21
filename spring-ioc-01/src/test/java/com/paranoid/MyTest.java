package com.paranoid;

import com.paranoid.dao.impl.UserDaoMysqlImpl;
import com.paranoid.service.UserService;
import com.paranoid.service.impl.UserServiceImpl;
import org.junit.Test;

public class MyTest {

    @Test
    public void testUserService(){
        UserService service = new UserServiceImpl();
        service.getUser();
    }
    @Test
    public void testIOCUserService(){
        UserService service = new UserServiceImpl();
        service.setUserDao(new UserDaoMysqlImpl());
        service.getUser();
    }
}
