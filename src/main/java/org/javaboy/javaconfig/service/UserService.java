package org.javaboy.javaconfig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service("javaboyService")
@Service
public class UserService {

    @Autowired
    UserDao userDao;
    public String hello() {
        return userDao.hello();
    }

    public List<String> getAllUser() {
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            users.add("javaboy:" + i);
        }
        return users;
    }
}
