package org.javaboy.others;

import org.javaboy.javaconfig.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-others.xml");
        User user = ctx.getBean("user", User.class);
        User user2 = ctx.getBean("user", User.class);
        System.out.println(user==user2);*/

        /*ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-others.xml");
        User user = ctx.getBean("user", User.class);
        User user2 = ctx.getBean("user2", User.class);
        System.out.println(user);
        System.out.println(user2);*/

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-others.xml");
        User user = ctx.getBean("user,user1,user2,user3", User.class);
        User user2 = ctx.getBean("user,user1,user2,user3", User.class);
        System.out.println(user);
        System.out.println(user2);

    }
}
