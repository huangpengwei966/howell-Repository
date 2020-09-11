package org.javaboy.aware;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = "org.javaboy.aware.service",useDefaultFilters = true,excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})
public class JavaConfig {
    /*//@Bean
    @Bean("javaboy")
    SayHello sayHello() {
        return new SayHello();
    }*/
}
