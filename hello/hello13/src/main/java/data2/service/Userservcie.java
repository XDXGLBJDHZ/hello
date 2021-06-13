package data2.service;

import data2.util.PageBean;

public interface Userservcie {
    public PageBean findByPage(int pageNumber ,int pageSize) throws Exception;
}
