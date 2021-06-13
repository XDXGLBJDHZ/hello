package data2.util;


import java.util.List;

/**
 * PageBean
 * @author ME08I
 * @date 2021/6/13
 */
public class PageBean {
    private List list; /*存储数据*/
    private int pageNumber;/*当前页*/
    private int pageSize;/*每页显示记录数*/
    private int totalRecords;/*总数*/

    /*获取总页数*/
    public int getTotalPages() {
        if (totalRecords % pageSize == 0) {
            return totalRecords / pageSize;
        } else {
            return totalRecords / pageSize + 1;
        }
    }

    /*过去首页的跳转页数*/
    public int getTopPageNumber() {
            return 1;
    }

    /*获取尾页的跳转页数*/
    public int getBottomPageNumber() {
        return getTotalPages();
    }

    /*获取下一页的跳转页数*/
    public int getNextPageNumber() {
        if (pageNumber >= getBottomPageNumber()) {
            return getBottomPageNumber();
        } else {
            return pageNumber + 1;
        }
    }

    /*获取前一页的跳转页数*/
    public int getPreviousPageNumber() {
        if(pageNumber<=1){
            return 1;
        }else{
            return pageNumber-1;
        }
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }
}
