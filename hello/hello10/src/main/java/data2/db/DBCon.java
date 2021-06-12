package data2.db;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import javax.sql.*;
import java.sql.*;
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
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setObject(i + 1, params[i]);
        }
        result = preparedStatement.executeQuery();
        return result;
    }

    public void doclose() throws Exception{
        connection.close();
    }
}
