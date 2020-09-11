package org.javaboy.profile;

import org.javaboy.conditional.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class JavaConfig {
    @Bean("ds")
    @Profile("dev")
    DataSource devDataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/dev");
        dataSource.setUsername("root");
        dataSource.setPassword("123");
        return dataSource;
    }
    @Bean("ds")
    @Profile("prod")
    DataSource prodDataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setUrl("jdbc:mysql://192.158.222.33:3306/dev");
        dataSource.setUsername("jkldasjfkl");
        dataSource.setPassword("jfsdjflkajkld");
        return dataSource;
    }
}