package Service.impl;

import Service.UserService;
import bean.User;
import dao.UserDao;
import dao.impl.UserDaoImpl;

public class UserServiceImpl implements UserService {
    UserDaoImpl userDao=new UserDaoImpl();
    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
