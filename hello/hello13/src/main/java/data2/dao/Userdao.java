package data2.dao;

import data2.bean.User;

import java.util.List;

public interface Userdao {
    List<User> findByPage(int pageNumber ,int pageSize);

    int getTotalRecords();
}
