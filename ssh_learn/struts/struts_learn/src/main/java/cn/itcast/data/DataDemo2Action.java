package cn.itcast.data;

import cn.itcast.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 模型驱动获取表单数据
 *
 * @author ME08I
 * @date 2021/8/10
 */
public class DataDemo2Action extends ActionSupport implements ModelDriven<User> {
    //创建对象
    //表单输入的name属性值，必须和实体类的属性相同。
    private User user = new User();


    @Override
    public User getModel() {
        //返回创建的对象
        return user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return NONE;
    }


}
