package cap.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ME08I
 * @date 2021/8/20
 */
@SuppressWarnings("serial")
public class TimerAction extends ActionSupport {
    public String timer() throws Exception {
        Thread.sleep(500);
        return SUCCESS;
    }

    @Override
    public String execute() throws Exception {
        return NONE;
    }
}
