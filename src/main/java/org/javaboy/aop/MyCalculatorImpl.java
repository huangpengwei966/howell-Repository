package org.javaboy.aop;

import org.springframework.stereotype.Component;

@Component
public class MyCalculatorImpl {
    //在 add 方法上添加了 @Action 注解，表示该方法将会被 Aop 拦截
    @Action
    public int add(int a, int b) {
        System.out.println("计算中。。。");
        return a + b;
    }

    public void min(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    }
}