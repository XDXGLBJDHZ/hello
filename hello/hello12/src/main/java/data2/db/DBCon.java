package data2.db;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DBCon {
    private Connection connection = null;
    private DataSource dataSource = null;

    public Connection getconnection() throws Exception {
        Properties properties = new Properties();
        properties.load(DBCon.class.getClassLoader().getResourceAsStream("db.properties"));
        dataSource = BasicDataSourceFactory.createDataSource(properties);
        connection = dataSource.getConnection();
        return connection;
    }

    public ResultSet doQuery(String sql, Object[] params) throws Exception {
        ResultSet result = null;
        getconnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {    //参数是从1开始，所以i=0
            preparedStatement.setObject(i + 1, params[i]);
        }
        result = preparedStatement.executeQuery();
        return result;
    }

    public int doUpdate(String procedure, Object[] params) throws Exception {
        int res = 0;
        connection = this.getconnection();
        CallableStatement pstmt = connection.prepareCall(procedure);
        for (int i = 0; i < params.length; i++) {
            pstmt.setObject(i + 1, params[i]);
        }
        res = pstmt.executeUpdate();
        return res;
    }

    public void close() {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
