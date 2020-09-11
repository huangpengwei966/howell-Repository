package org.javaboy.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaMain {
    public static void main(String[] args) {
       /* AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.register(JavaConfig.class);
        ctx.refresh();
        DataSource ds = (DataSource) ctx.getBean("ds");
        System.out.println(ds);*/

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.setConfigLocation("applicationContext.xml");
        ctx.refresh();
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
    }
}
