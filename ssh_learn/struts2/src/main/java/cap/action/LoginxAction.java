package cap.action;

import cap.bean.Admin;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 数据模型驱动
 * @author ME08I
 * @date 2021/8/4
 */
//@SuppressWarnings("serial")
public class LoginxAction extends ActionSupport implements ModelDriven<Admin> {
    private Admin admin;

    @Override
    public Admin getModel() {
        if (admin == null) {
            admin = new Admin();
        }
        return admin;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String loginx() {

        if (admin.getUsername().equals("yzk") && admin.getPassword().equals("123")) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
