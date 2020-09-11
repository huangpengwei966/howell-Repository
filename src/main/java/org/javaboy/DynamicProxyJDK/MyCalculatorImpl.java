package org.javaboy.DynamicProxyJDK;

public class MyCalculatorImpl implements MyCalculator {
    public int add(int a, int b) {
        System.out.println("计算中。。。。。");
        return a+b;

    }

}
