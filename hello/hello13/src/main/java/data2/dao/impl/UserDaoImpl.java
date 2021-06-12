package data2.dao.impl;

import data2.bean.User;
import data2.dao.Userdao;
import data2.db.DBcon;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * UserDdoImpl
 * @author ME08I
 * @date 2021/6/12
 */
public class UserDaoImpl implements Userdao {
    DBcon dBcon=null;
    @Override
    public List<User> findByPage(int pageNumber, int pageSize) {
        List<User> userList = new ArrayList<>();
        String sql= "select * from user limit ?,?";
        ResultSet resultSet=dBcon.doQuery(sql,new Object[]{(pageNumber-1)*pageSize,pageSize});/*数组一体初始化的方法，可将其理解为
        params[0]=(pageNumber-1)*pageSize,params[1]=pageSize*/
        try{
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("Username"));
                user.setPassword(resultSet.getString("password"));
                userList.add(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            dBcon.close();
        }
        return userList;
    }

    @Override
    public int getTotalRecords() {
        return 0;
    }
}
