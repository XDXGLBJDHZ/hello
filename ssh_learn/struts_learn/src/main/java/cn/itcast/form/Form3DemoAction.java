package cn.itcast.form;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Action操作域对象
 * @author ME08I
 * @date 2021/8/9
 */
public class Form3DemoAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        //用三种方法操作域对象
        //request域
        HttpServletRequest request= ServletActionContext.getRequest();
        request.setAttribute("req","reqValue");
        //session域
        HttpSession session=request.getSession();
        session.setAttribute("sess","sessValue");
        //ServletContext域
        ServletContext context=ServletActionContext.getServletContext();
        context.setAttribute("contextName","contextValue");
        return NONE;
    }
}
