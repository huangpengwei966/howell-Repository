package org.javaboy.aware.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SayHello implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    public String sayHello(String name) {
        //判断容器中是否存在某个 Bean
        boolean userDao = applicationContext.containsBean("userDao");
        System.out.println(userDao);
        return "hello " + name;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
