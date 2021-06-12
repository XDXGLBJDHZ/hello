package data2.db;

import com.mysql.cj.xdevapi.PreparableStatement;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DBcon {
    private Connection connection = null;
    private DataSource dataSource = null;

    public Connection getConnection() throws Exception {
        Properties properties = new Properties();
        properties.load(DBcon.class.getClassLoader().getResourceAsStream("db.properties"));
        dataSource = BasicDataSourceFactory.createDataSource(properties);
        connection = dataSource.getConnection();
        return connection;
    }

    public ResultSet doQuery(String sql, Object[] params) {
        ResultSet result = null;
        try {
            getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }//将传入的params放入sql语句中，如i+1的位置，放入params[0]
            result = preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int doUpdate(String sql, Object[] params) {
        int result = 0;
        try {
            connection = this.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public void close() {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
