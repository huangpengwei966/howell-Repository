package org.javaboy.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        MyCalculatorImpl myCalculator = ctx.getBean(MyCalculatorImpl.class);
        myCalculator.add(3, 4);
        myCalculator.min(3, 4);*/

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
        MyCalculatorImpl myCalculator = ctx.getBean(MyCalculatorImpl.class);
        myCalculator.add(3, 4);
        myCalculator.min(5, 6);
    }
}