package data2.dao;

import data2.bean.User;

import java.util.List;

/**
 * 定义数据访问接口
 */
public interface UserDao {
    List<User> findAll();

    int delUser(int id);

    User findById(int id);

    int updateUser(User user);

    int addUser(User user);
}
