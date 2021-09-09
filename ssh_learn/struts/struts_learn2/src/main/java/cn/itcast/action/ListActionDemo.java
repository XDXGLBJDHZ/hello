package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;
import cn.itcast.bean.User;

import java.util.List;

/**
 * 表单数据封装到list集合
 *
 * @author ME08I
 * @date 2021/8/17
 */
public class ListActionDemo extends ActionSupport {
    //声明list变量
    private List<User> list;

    //生成get和set方法
    @Override
    public String execute() throws Exception {
        System.out.println(list);
        return NONE;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }
}
