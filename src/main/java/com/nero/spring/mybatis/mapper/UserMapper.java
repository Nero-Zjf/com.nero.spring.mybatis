package com.nero.spring.mybatis.mapper;


import com.nero.spring.mybatis.domain.User;

import java.util.List;

public interface UserMapper {

    User getUserById(Long id);

    List<User> getAllUser();

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Long id);
}
