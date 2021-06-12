package data2.db;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBPool_c3p0 {
    private Connection connection=null;
    @Test
    public Connection getConnection() throws Exception{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        connection=dataSource.getConnection();
        return connection;
    }
    @Test
    public ResultSet doQuery(String sql, Object[] params) throws Exception {
        ResultSet result = null;
        getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setObject(i + 1, params[i]);
        }
        result = preparedStatement.executeQuery();
        return result;
    }
}
