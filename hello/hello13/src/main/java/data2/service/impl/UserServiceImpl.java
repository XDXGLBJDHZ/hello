package data2.service.impl;

import data2.dao.Userdao;
import data2.dao.impl.UserDaoImpl;
import data2.service.Userservcie;
import data2.util.PageBean;

public class UserServiceImpl implements Userservcie {
    private Userdao userdao=new UserDaoImpl();
    @Override
    public PageBean findByPage(int pageNumber, int pageSize) throws Exception {
        PageBean pageBean=new PageBean();
        pageBean.setList(userdao.findByPage(pageNumber,pageSize));
        pageBean.setPageNumber(pageNumber);
        pageBean.setPageSize(pageSize);
        pageBean.setTotalRecords(userdao.getTotalRecords());
        return pageBean;
    }
}
