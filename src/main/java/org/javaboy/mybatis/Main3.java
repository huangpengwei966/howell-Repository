package org.javaboy.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.javaboy.mybatis.model.Book;
import org.javaboy.mybatis.model.Role;
import org.javaboy.mybatis.model.User;
import org.javaboy.mybatis.mymapper.BookMapper;
import org.javaboy.mybatis.mymapper.UserRoleMapper;
import java.util.List;


public class Main3 {
    public static void main(String[] args) {
        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
        SqlSession sqlSession = instance.openSession();
       /* BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Book book=mapper.getBookById2(1);
        System.out.println(book);*/

        UserRoleMapper mapper = sqlSession.getMapper(UserRoleMapper.class);
        User user=mapper.getUserById(1);

        //Mybatis 一级缓存的作用域是同一个SqlSession,同样的SQL只执行一次，其余的都取自缓存
        sqlSession.close();
        SqlSession sqlSession2 = instance.openSession();
        UserRoleMapper mapper2 = sqlSession2.getMapper(UserRoleMapper.class);
        user=mapper2.getUserById(1);
        System.out.println(user);
    }
}
