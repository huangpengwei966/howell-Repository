package org.javaboy.mybatis.mymapper;

import org.javaboy.mybatis.model.User2;
import java.util.List;

public interface UserMapper {
    User2 getUserById(Integer id);

    Integer addUser(User2 user);

    Integer deleteUserById(Integer id);

    Integer updateUser(User2 user);

    List<User2> getAllUser();
}