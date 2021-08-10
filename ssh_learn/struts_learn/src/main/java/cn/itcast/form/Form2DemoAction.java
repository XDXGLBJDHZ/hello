package cn.itcast.form;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ME08I
 * @date 2021/8/7
 */
public class Form2DemoAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        //第二种方法，使用ServletActionContext类来获取
        //使用类获取request对象
        HttpServletRequest request = ServletActionContext.getRequest();
        //调用request里面的方法来得到结果
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        System.out.println(username + "," + password + "," + address);
        return NONE;
    }
}
