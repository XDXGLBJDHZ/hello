package cap.db;

import java.sql.*;

public class DBCon {
    private String dbDriver = "com.mysql.cj.jdbc.Driver";
    private String dbUrl = "jdbc:mysql://localhost:3306/data2?useUnicode=true&characterEncoding=utf-8";
    private String dbUser = "root";
    private String dbPass = "toor";
    private Connection conn = null;

    //连接数据库
    public Connection getConnection() throws Exception {
        Class.forName(dbDriver);
        conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        return conn;
    }

    //数据库查询
    public ResultSet doquery(String sql) throws Exception {
        ResultSet rs = null;
        conn = this.getConnection();
        Statement stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        return rs;
    }

    //数据库更新
    public int doUpdata(String sql) throws Exception {
        int res = 0;
        conn = this.getConnection();
        Statement stmt = conn.createStatement();
        res = stmt.executeUpdate(sql);
        return res;
    }

    //关闭资源
    public void close() throws Exception {
        conn.close();
    }
}

