package org.javaboy.transaction;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-transaction.xml");
    UserService userService= ctx.getBean(UserService.class);


    @Test
    public void test1() {
        userService.updateMoney();
    }

}
