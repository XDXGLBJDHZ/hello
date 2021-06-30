package action;

import Service.UserService;
import Service.impl.UserServiceImpl;
import bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test2")
public class Servlet extends HttpServlet {
    UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String action = req.getParameter("action");
        if (action.equals("addUser")) {
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            User user = new User(username, password);
            int result= userService.addUser(user);
            if (result>0){
                out.print("添加成功");
            }else{
                out.println("添加失败");
            }
        }
    }
}
