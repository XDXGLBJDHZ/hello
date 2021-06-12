package data2.service;

import data2.bean.User;

import java.util.List;

/***
 * 业务逻辑接口
 */

public interface UserService {
    List<User> findAll();

    int delUser(int id);

    User findById(int id);

    int updateUser(User user);

    int addUser(User user);
}
