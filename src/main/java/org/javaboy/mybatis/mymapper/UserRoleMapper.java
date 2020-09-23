package org.javaboy.mybatis.mymapper;

import org.javaboy.mybatis.model.Role;
import org.javaboy.mybatis.model.User;

import java.util.List;

public interface UserRoleMapper {

    User getUserById(Integer id);

    List<Role> getRolesByUid(Integer id);
}