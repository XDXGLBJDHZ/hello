package cn.itcast.action;

import cn.itcast.bean.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * 表单数据封装到map集合
 *
 * @author ME08I
 * @date 2021/8/18
 */
public class MapActionDemo extends ActionSupport {
    private Map<String, User> map;

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(map);
        return NONE;
    }
}
