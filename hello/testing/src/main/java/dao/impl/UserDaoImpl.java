package dao.impl;

import bean.User;
import dao.UserDao;
import db.DBCon;

public class UserDaoImpl implements UserDao {
    @Override
    public int addUser(User user) {
        int result=0;
        try {
            DBCon dbCon=new DBCon();
            String sql="insert into user values(NULL,?,?)";
            result=dbCon.doUpdate(sql,new Object[]{user.getUsername(),user.getPassword()});
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
