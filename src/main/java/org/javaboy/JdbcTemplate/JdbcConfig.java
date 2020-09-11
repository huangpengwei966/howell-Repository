package org.javaboy.JdbcTemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
public class JdbcConfig {
    @Bean
    DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUsername("sxgs");
        dataSource.setPassword("sxgs_123");
        dataSource.setUrl("jdbc:oracle:thin:@172.27.34.149:1521/erpdb03");
        return dataSource;
    }
    @Bean
    JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
