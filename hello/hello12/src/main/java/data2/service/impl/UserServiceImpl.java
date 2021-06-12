package data2.service.impl;

import data2.bean.User;
import data2.dao.UserDao;
import data2.dao.impl.UserDaoImpl;
import data2.service.UserService;

import java.util.List;

/**
 * 业务逻辑实现
 */

public class UserServiceImpl implements UserService {
    private UserDaoImpl userDaoImpl = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        return userDaoImpl.findAll();
    }

    @Override
    public int delUser(int id) {
        return userDaoImpl.delUser(id);
    }

    @Override
    public User findById(int id) {
        return userDaoImpl.findById(id);
    }

    @Override
    public int updateUser(User user) {
        return userDaoImpl.updateUser(user);
    }

    @Override
    public int addUser(User user) {
        return userDaoImpl.addUser(user);
    }
}
