package cn.itcast.form;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * @author ME08I
 * @date 2021/8/6
 */
public class Form1DemoAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        //第一种方法，使用一个ActionContext类
        //获取ActionContext对象
        ActionContext context =ActionContext.getContext();
        //调用方法得到表单数据
        //key表单输入项的name属性值，value则是输入的值
        Map<String,Object> map = context.getParameters();
        //遍历map拿到结果（遍历Map有两种方式）
        Set<String> keys =map.keySet();
        //增强for循环
        for (String key:keys){
            //根据key得到value
            //输入值是数组形式，因为输入值中可能存在复选框的存在。
            Object[] obj= (Object[]) map.get(key);
            System.out.println(Arrays.toString(obj));
        }
        return NONE;
    }
}
