package db;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DBCon {
    private Connection connection = null;
    private DataSource dataSource = null;

    public Connection getConnection() throws Exception {
        Properties properties = new Properties();
        properties.load(DBCon.class.getClassLoader().getResourceAsStream("db.properties"));
        dataSource = BasicDataSourceFactory.createDataSource(properties);
        connection = dataSource.getConnection();
        return connection;
    }

    public int doUpdate(String sql,Object[] params) throws Exception{
        connection=this.getConnection();
        PreparedStatement preparedStatement =connection.prepareStatement(sql);
        for (int i=0;i< params.length;i++){
            preparedStatement.setObject(i+1,params[i]);
        }
        int result=preparedStatement.executeUpdate();
        return result;
    }
}
