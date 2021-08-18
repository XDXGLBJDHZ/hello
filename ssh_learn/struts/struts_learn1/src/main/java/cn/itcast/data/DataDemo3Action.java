package cn.itcast.data;

import cn.itcast.bean.Student;
import cn.itcast.bean.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 使用表达式封装数据
 *
 * @author ME08I
 * @date 2021/8/11
 */
public class DataDemo3Action extends ActionSupport {
    //1.声明实体类
    private User user;
    private Student student;
    //生成实体类的get方法和set方法

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        System.out.println(student.getId());
        return NONE;
    }
}
