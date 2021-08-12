package cap.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 一个普通的struts项目
 *
 * @author ME08I
 * @date 2021/8/11
 */
@SuppressWarnings("serial")
public class HelloWorldAction extends ActionSupport {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String execute() {
        System.out.println("execute方法已执行");
        return SUCCESS;
    }

    public String login() {
        System.out.println("login方法已执行");
        username = "欢迎你," + username;
        return SUCCESS;
    }
}
