package data2.dao.impl;

import data2.bean.User;
import data2.dao.Userdao;
import data2.db.DBCon;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * UserDdoImpl
 *
 * @author ME08I
 * @date 2021/6/12
 */
public class UserDaoImpl implements Userdao {
    private DBCon dbcon = null;

    @Override
    public List<User> findByPage(int pageNumber, int pageSize) throws Exception {
        List<User> userList = new ArrayList<>();

        /*数组一体初始化的方法，可将其理解为
        params[0]=(pageNumber-1)*pageSize,params[1]=pageSize*/

        try {
            dbcon=new DBCon();
            String sql = "select * from user limit ?,?";
            ResultSet resultSet = dbcon.doQuery(sql, new Object[]{(pageNumber - 1) * pageSize, pageSize});
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("Username"));
                user.setPassword(resultSet.getString("password"));
                userList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbcon.close();
        }
        return userList;
    }

    @Override
    public int getTotalRecords() {/*上传记录*/
        int total = 0;
        try {
            dbcon = new DBCon();
            String sql = "select count(*) as total from user";
            ResultSet result = dbcon.doQuery(sql, new Object[]{});
            if (result.next()) {
                total = result.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }
}
