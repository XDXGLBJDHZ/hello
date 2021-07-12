package dao.impl;

import bean.User;
import dao.UserDao;
import db.DBCon;

public class UserDaoImpl implements UserDao {
    DBCon dbCon=null;
    @Override
    public int addUser(User user) {
        int result=0;
        try {
            dbCon=new DBCon();
            String sql="insert into user values(NULL,?,?)";
            result=dbCon.doUpdate(sql,new Object[]{user.getUsername(),user.getPassword()});
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
