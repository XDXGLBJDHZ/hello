package data2.dao.impl;

import data2.bean.User;
import data2.dao.UserDao;
import data2.db.DBCon;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 * 访问数据接口实现
 */
public class UserDaoImpl implements UserDao {
    DBCon dbCon = null;

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try {
            dbCon = new DBCon();
            String sql = "select * from user";
            ResultSet resultSet = dbCon.doQuery(sql, new Object[]{});
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                userList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbCon.close();
        }
        return userList;
    }

    @Override
    public int delUser(int id) {
        int result = 0;
        try {
            DBCon dbCon = new DBCon();
            String sql = "delete from user where id =?";
            result = dbCon.doUpdate(sql, new Object[]{id});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public User findById(int id) {
        User user = null;
        try {
            dbCon = new DBCon();
            String sql = "select * from user where id=?";
            ResultSet resultSet = dbCon.doQuery(sql, new Object[]{id});
            if (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbCon.close();
        }
        return user;
    }

    @Override
    public int updateUser(User user) {
        int result = 0;
        try {
            dbCon = new DBCon();
            String sql = "update user set username=? ,password=? where id=?";
            result = dbCon.doUpdate(sql, new Object[]{user.getUsername(),user.getPassword(),user.getId()});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int addUser(User user) {
        int result=0;
        try{
            dbCon = new DBCon();
            String sql ="insert into user values(NULL,?,?)";
            result = dbCon.doUpdate(sql, new Object[]{user.getUsername(),user.getPassword()});
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
