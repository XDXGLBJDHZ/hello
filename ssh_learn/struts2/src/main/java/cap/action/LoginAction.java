package cap.action;


import cap.bean.Admin;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 向对象传递数据
 * @author ME08I
 * @date 2021/8/4
 */
public class LoginAction extends ActionSupport {
    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public String login() {
        if (admin.getUsername().equals("yzk") && admin.getPassword().equals("123456")) {
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
}
