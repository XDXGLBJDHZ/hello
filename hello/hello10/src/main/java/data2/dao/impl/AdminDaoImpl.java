package data2.dao.impl;

import data2.dao.AdminDao;
import data2.db.DBCon;
import java.sql.*;
public class AdminDaoImpl implements AdminDao{
    private DBCon dbCon=null;
    @Override
    public int login(String username, String password)throws Exception{
        int result=-1;
        dbCon=new DBCon();
        String sql="select * from user where username=?and password=?";
        ResultSet resultSet=dbCon.doQuery(sql,new Object[]{username,password});
        if(resultSet.next()){
            result=1;
        }
        return result;
    }
}
