package com.mybatis.dao;

import com.mybatis.pojo.User;
import com.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.awt.*;
import java.util.List;

/**
 * @author ME08I
 * @date 2021/9/5
 */
public class UserDaoTest {
    @Test
    //查询所有的用户
    public void testGetUser() {
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //执行sql语句
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }


    @Test
    //根据id查询一个用户
    public void testGetUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(5);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    //增删改需要提交事物
    //增加一个用户
    public void testAddUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int num = userMapper.addUser(new User(5, "sfsf", 2131));
        //提交事物
        sqlSession.commit();
        sqlSession.close();
    }
}
