package org.javaboy.JdbcTemplate;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main {

    //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-jdbc.xml");
    JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);


    /*@Test
    public void insert() {
        jdbcTemplate.update("insert into user1 (username,address) values (?,?)", "javaboy", "www.javaboy.org");
    }*/

    /*@Test
    public void update() {
        jdbcTemplate.update("update user1 set username=? where id=?", "javaboy123", 1);

    }*/

    /*@Test
    public void delete() {
        jdbcTemplate.update("delete from user1 where id=?", 2);
    }*/

    /*@Test
    public void select() {
        User1 user = jdbcTemplate.queryForObject("select * from user1 where id=?", new BeanPropertyRowMapper<User1>(User1.class), 1);
        System.out.println(user);
    }*/

    /*//要求查出来的字段必须和 Bean 的属性名一一对应,否则查处的字段为'null'
    @Test
    public void select2() {
        User1 user = jdbcTemplate.queryForObject("select id,username as name,address from user1 where id=?", new BeanPropertyRowMapper<User1>(User1.class), 1);
        System.out.println(user);
    }*/

    /*@Test
    public void select3() {
        User1 user = jdbcTemplate.queryForObject("select * from user1 where id=?", new RowMapper<User1>() {
            public User1 mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String address = resultSet.getString("address");
                User1 u = new User1();
                u.setId(id);
                u.setName(username);
                u.setAddress(address);
                return u;
            }
        }, 1);
        System.out.println(user);
    }*/

    @Test
    public void select4() {
        List<User1> list = jdbcTemplate.query("select * from user1", new BeanPropertyRowMapper<User1>(User1.class));
        System.out.println(list);
    }

}
