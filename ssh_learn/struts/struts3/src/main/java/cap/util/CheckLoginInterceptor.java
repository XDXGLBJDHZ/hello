package cap.util;

import cap.action.LoginAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import cap.bean.Admin;

import java.util.Map;

/**
 * @author ME08I
 * @date 2021/8/20
 */
public class CheckLoginInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("开始拦截器拦截");
        Object obj = actionInvocation.getAction();
        if (obj instanceof LoginAction) {
            System.out.println("登录拦截器不需要拦截");
            return actionInvocation.invoke();
        }
        Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
        Admin admin = (Admin) session.get("admin");
        if (admin != null) {
            System.out.println("已登录，无需拦截");
            return actionInvocation.invoke();
        } else {
            System.out.println("你还没有登录，请先登录");
            return Action.LOGIN;
        }
    }
}