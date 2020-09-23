package org.javaboy.mybatis.mymapper;

import org.apache.ibatis.annotations.Param;
import org.javaboy.mybatis.model.User2;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    /*//在旧的 MyBatis 版本中，如果使用 $，变量需要通过 @Param 取别名
    User2 getUserById(@Param("id") Integer id);*/
    User2 getUserById(Integer id);

    Integer addUser(User2 user);

    Integer deleteUserById(Integer id);

    Integer updateUser(User2 user);

    //Integer updateUsernameById(String param1, Integer param2);
    //Integer updateUsernameById(@Param("username") String username, @Param("id") Integer id);
    Integer updateUsernameById(HashMap<String,Object> map);

    //List<User2> getAllUser();
    List<User2> getAllUser(@Param("orderBy") String orderBy);

    //User2 getUserByName(@Param("username") String username);
    User2 getUserByName(String username);

    List<User2> getUserByPage(@Param("start") Integer start, @Param("count") Integer count);

    List<User2> getUserByUsernameAndId(@Param("id") Integer id, @Param("name") String name);

    List<User2> getUserByIds(@Param("ids")Integer[] ids);

    Integer batchInsertUser(@Param("users") List<User2> users);
}