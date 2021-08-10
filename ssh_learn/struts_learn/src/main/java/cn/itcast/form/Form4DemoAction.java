package cn.itcast.form;

import cn.itcast.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * 使用ServletActionContext来获取表单数据封装到实体类中
 * @author ME08I
 * @date 2021/8/9
 */
public class Form4DemoAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        //原始方式
        //获取表单数据
        HttpServletRequest request= ServletActionContext.getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        //封装到实体类
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAddress(address);
        System.out.println(user);
        return NONE;
    }
}
