package com.nero.spring.mybatis;

import com.nero.spring.mybatis.domain.User;
import com.nero.spring.mybatis.mapper.UserMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        List<User> users = userMapper.getAllUser();
        System.out.println(Arrays.toString(users.toArray()));
    }
}
