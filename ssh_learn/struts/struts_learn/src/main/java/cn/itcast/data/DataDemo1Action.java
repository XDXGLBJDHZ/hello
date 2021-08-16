package cn.itcast.data;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 属性封装
 * @author ME08I
 * @date 2021/8/9
 */
public class DataDemo1Action extends ActionSupport {
    //定义变量名称要和表单数据相同
    private String username;
    private String password;
    private String address;
    @Override
    public String execute() throws Exception {

        return NONE;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
