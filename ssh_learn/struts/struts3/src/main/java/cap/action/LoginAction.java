package cap.action;

import cap.bean.Admin;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * @author ME08I
 * @date 2021/8/20
 */
public class LoginAction extends ActionSupport implements SessionAware {
    private Admin admin;
    private Map<String, Object> session;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String login() {
        if (admin.getId().equals("123") && admin.getUsername().equals("yzk") && admin.getPassword().equals("123")) {
            session.put("admin", admin);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = session;
    }

}


