package cap.db;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class DBCon {
    private String Driver = "com.mysql.cj.jdbc.Driver";
    private String Url = "jdbc:mysql://localhost:3306/data2?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
    private String User = "root";
    private String Pass = "toor";
    private Connection connection = null;

    //连接数据库
    public Connection getConnection() throws Exception {
        Class.forName(Driver);
        connection = DriverManager.getConnection(Url, User, Pass);
        return connection;
    }

    //数据库查询
    public ResultSet doquery(String sql, Object[] params) throws Exception {
        ResultSet resultSet = null;
        getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setObject(i + 1, params[i]);
        }
        resultSet = preparedStatement.executeQuery();
        System.out.println("数据库已连接");
        return resultSet;
    }

    //数据库更新
    public int doUpdata(String sql, Object[] params) throws Exception {
        int result = 0;
        getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setObject(i + 1, params[i]);
        }
        result = preparedStatement.executeUpdate();
        return result;
    }

    //关闭资源
    public void close() throws Exception {
        if (connection != null) {
            connection.close();
        }
    }
}
