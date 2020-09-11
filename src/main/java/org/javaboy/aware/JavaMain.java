package org.javaboy.aware;

import org.javaboy.aware.service.SayHello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        SayHello hello = ctx.getBean(SayHello.class);
        System.out.println(hello.sayHello("javaboy"));

    }
}
