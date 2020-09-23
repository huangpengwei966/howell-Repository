package org.javaboy.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.javaboy.mybatis.model.User2;
import org.javaboy.mybatis.mymapper.UserMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
        SqlSession sqlSession = instance.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //int count =mapper.updateUsernameById("jack",3);
        /*HashMap<String,Object> map=new HashMap<String,Object>();
        map.put("username","tom");
        map.put("id",23);
        int count =mapper.updateUsernameById(map);*/

        //List<User2> allUser = mapper.getAllUser();
        /*List<User2> allUser = mapper.getAllUser("id");
        System.out.println(allUser);*/

        /*User2 user=mapper.getUserById(43);
        System.out.println(user);*/

        /*User2 user=mapper.getUserByName("javaboy");
        System.out.println(user);*/

        /*User2 user = new User2();
        user.setUsername("风气");
        user.setAddress("上海");
        List<String> favorites = new ArrayList<String>();
        favorites.add("足球");
        favorites.add("篮球");
        favorites.add("乒乓球");
        user.setFavorites(favorites);
        mapper.addUser(user);*/

        /*List<User2> list = mapper.getUserByPage(null, null);
        System.out.println(list);
        list = mapper.getUserByPage(2, 5);
        System.out.println(list);*/

        /*List<User2> list = mapper.getUserByUsernameAndId(2, "boy");
        System.out.println(list);
        list = mapper.getUserByUsernameAndId(null, "ix");
        System.out.println(list);
        list = mapper.getUserByUsernameAndId(5, null);
        System.out.println(list);
        list = mapper.getUserByUsernameAndId(null, null);
        System.out.println(list);*/

        /*Integer[] a={22,23};
        List<User2> list = mapper.getUserByIds(a);
        System.out.println(list);*/

        /*List<User2> users = new ArrayList<User2>();
        User2 u1 = new User2();
        u1.setUsername("zhangsan");
        u1.setAddress("shenzhen");
        users.add(u1);
        User2 u2 = new User2();
        u2.setUsername("lisi");
        u2.setAddress("广州");
        users.add(u2);
        mapper.batchInsertUser(users);*/

        User2 user=new User2();
        user.setId(43);
        user.setUsername("lili");
        mapper.updateUser(user);

        sqlSession.commit();
    }
}
