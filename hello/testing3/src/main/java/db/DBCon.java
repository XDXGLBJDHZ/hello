package db;

import java.sql.*;

public class DBCon {
    private String driverClassName = "com.mysql.cj.jdbc.Driver";
    private String dburl = "jdbc:mysql://localhost:3306/data2?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
    private String dbuser = "root";
    private String dbpass = "toor";
    Connection connection = null;

    public Connection getConnection() throws Exception {
        Class.forName(driverClassName);
        connection = DriverManager.getConnection(dburl, dbuser, dbpass);
        return connection;
    }

    public int doUpdate(String sql, Object[] params) throws Exception {
        connection = this.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setObject(i + 1, params[i]);
        }
        int result = preparedStatement.executeUpdate();
        return result;
    }
}
