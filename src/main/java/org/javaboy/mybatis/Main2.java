package org.javaboy.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.javaboy.mybatis.model.User2;
import org.javaboy.mybatis.mymapper.UserMapper;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
        SqlSession sqlSession = instance.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User2> allUser = mapper.getAllUser();
        System.out.println(allUser);

        /*User2 user = new User2();
        user.setUsername("风气");
        user.setAddress("上海");
        List<String> favorites = new ArrayList<String>();
        favorites.add("足球");
        favorites.add("篮球");
        favorites.add("乒乓球");
        user.setFavorites(favorites);
        mapper.addUser(user);
        sqlSession.commit();*/
    }
}
