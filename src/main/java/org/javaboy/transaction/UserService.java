package org.javaboy.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    @Transactional
    public void updateMoney() {
        userDao.addMoney("zhangsan", 200);
        int i = 1 / 0;
        userDao.minMoney("lisi", 200);
    }
}
