package service.impl;

import bean.User;
import dao.impl.UserDaoImpl;
import service.UserService;

public class UserServiceImpl implements UserService {
    UserDaoImpl userDao=new UserDaoImpl();
    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
