package org.javaboy.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.javaboy.mybatis.model.User2;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSessionFactory factory=SqlSessionFactoryUtils.getInstance();
        SqlSession sqlSession = factory.openSession();

        //查
        User2 user = (User2) sqlSession.selectOne("org.javaboy.mybatis.mymapper.UserMapper.getUserById",3);
        System.out.println(user);
        /*List<User2> list = sqlSession.selectList("org.javaboy.mybatis.mymapper.UserMapper.getAllUser");
        System.out.println(list);*/

        /*//增
        User2 user = new User2();
        user.setUsername("赵六");
        user.setAddress("北京");
        int insert = sqlSession.insert("org.javaboy.mybatis.mymapper.UserMapper.addUser", user);
        System.out.println(insert);*/

        /*//删
        int delete = sqlSession.delete("org.javaboy.mybatis.mymapper.UserMapper.deleteUserById", 1);
        System.out.println(delete);*/

        /*User2 user = new User2();
        user.setId(22);
        user.setUsername("javaboy222");
        int update = sqlSession.update("org.javaboy.mybatis.mymapper.UserMapper.updateUser", user);*/

        //sqlSession.commit();

        sqlSession.close();
    }
}