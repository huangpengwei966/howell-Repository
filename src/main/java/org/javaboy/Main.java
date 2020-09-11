package org.javaboy;

import org.javaboy.javaconfig.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\HPW\\Desktop\\hpwSpring\\getBean\\src\\main\\resources\\applicationContext.xml");
        User user = (User) ctx.getBean("user");
        //Book book = ctx.getBean(Book.class);
        System.out.println(user.toString());
        */

        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        //SayHello hello = ctx.getBean(SayHello.class);
        //SayHello hello = (SayHello) ctx.getBean("sayHello");
        //SayHello hello = (SayHello) ctx.getBean("javaboy");
        //System.out.println(hello.sayHello("javaboy"));

        /*UserService userService = ctx.getBean(UserService.class);
        //UserService userService =(UserService) ctx.getBean("userService");
        //UserService userService =(UserService) ctx.getBean("javaboyService");
        System.out.println(userService.getAllUser());*/

        UserService userService = ctx.getBean(UserService.class);
        List<String> list = userService.getAllUser();
        System.out.println(list);

    }
}
