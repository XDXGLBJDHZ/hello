package com.mybatis.dao;

import com.mybatis.pojo.User;

import java.util.List;

/**
 * @author ME08I
 * @date 2021/9/5
 */
public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //增加一个用户
    int addUser(User user);
}
