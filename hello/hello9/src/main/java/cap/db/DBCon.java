package cap.db;
import java.sql.*;
public class DBCon {
    private static String dbDriver="com.mysql.cj.jdbc.Driver";
    private String dbUrl = "jdbc:mysql://localhost:3306/data2?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
    private String dbUser = "root";
    private String dbPass = "toor";
    private Connection conn= null;

    public Connection getConnection() throws Exception {
        Class.forName(dbDriver);
        conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        return conn;
    }

    public ResultSet doquery(String procedure,Object[] params) throws Exception {
        ResultSet rs = null;
        conn = this.getConnection();
        CallableStatement pstmt = conn.prepareCall(procedure);
        for (int i=0;i<params.length;i++){
            pstmt.setObject(i+1,params[i]);
        }
        rs = pstmt.executeQuery();
        return rs;
    }

    public int doUpdata(String procedure,Object[] params) throws Exception {
        int res = 0;
        conn = this.getConnection();
        CallableStatement pstmt = conn.prepareCall(procedure);
        for (int i=0;i<params.length;i++) {
            pstmt.setObject(i + 1, params[i]);
        }
        res = pstmt.executeUpdate();
        return res;
    }

    public void close()throws Exception{
        conn.close();
    }
}
