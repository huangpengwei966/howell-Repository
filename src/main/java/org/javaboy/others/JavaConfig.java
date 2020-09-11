package org.javaboy.others;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@ImportResource("classpath:applicationContext-others.xml")//混合配置就是 Java 配置+XML 配置。混用的话，可以在 Java 配置中引入 XML 配置。
//@ComponentScan(basePackages = "org.javaboy.javaconfig.service")
@ComponentScan(basePackages = "org.javaboy.javaconfig",useDefaultFilters = true,excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})
public class JavaConfig {
    @Bean
    @Scope("prototype")
    SayHello sayHello() {
        return new SayHello();
    }
}
