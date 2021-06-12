package data2.trans;

import java.sql.*;

import data2.db.DBPool;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
public class JDBCTrans {
    public void trans()throws Exception{
        Connection connection = (new DBPool()).getconnection();
        try {
            connection.setAutoCommit(false);
            String sql = "insert into user value(NULL,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, "kkk");
            preparedStatement.setObject(2, "njdsjf");
            preparedStatement.executeUpdate();
            System.out.println("数据1插入成功");
            int i = 10 / 0;
            preparedStatement.setObject(1, "ddd");
            preparedStatement.setObject(2, "ddd");
            preparedStatement.executeUpdate();
            System.out.println("数据2插入成功");
            connection.commit();
        }catch (Exception e){
            e.printStackTrace();
            connection.rollback();//执行事物回滚，之前插入的数据会被撤销。将事物打包成为整体，要么插入成功要么都失败。
        }
    }
}
