package data2.action;

import data2.bean.User;
import data2.service.UserService;
import data2.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 处理请求Servlet实现类，此类仅进行页面的重定向和数据的JSP页面的数据接收
 */
@WebServlet("/user")//将Servlet映射到地址上
public class UserServlet extends HttpServlet {
    /**
     * 调用UserService的方法展现出UserServiceImpl的结果
     */
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        String action = req.getParameter("action");
        if (action.equals("list")) {
            List<User> userList = userService.findAll();
            req.getSession().setAttribute("admins", userList);
            req.getRequestDispatcher("ListUser.jsp").forward(req, resp);
        } else if (action.equals("del")) {
            int id = Integer.parseInt(req.getParameter("id"));
            int result = userService.delUser(id);
            if (result > 0) {
                req.getRequestDispatcher("user?action=list").forward(req, resp);
            } else {
                PrintWriter pw = resp.getWriter();
                pw.println("删除失败");
                pw.close();
            }
        } else if (action.equals("edit")) {
            int id = Integer.parseInt(req.getParameter("id"));
            User user = userService.findById(id);
            req.getSession().setAttribute("user", user);
            req.getRequestDispatcher("editUser.jsp").forward(req, resp);
        } else if (action.equals("update")) {
            int id = Integer.parseInt(req.getParameter("id"));
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            User user = new User(id, username, password);
            int result = userService.updateUser(user);
            if (result > 0) {
                req.getRequestDispatcher("user?action=list").forward(req, resp);
            } else {
                PrintWriter pw = resp.getWriter();
                pw.println("更新失败");
                pw.close();
            }
        } else if (action.equals("addUser")) {
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            User user = new User(username, password);   //将传入的参数封装为一个对象
            int result = userService.addUser(user);
            if (result > 0) {
                req.getRequestDispatcher("user?action=list").forward(req, resp);
            } else {
                PrintWriter pw = resp.getWriter();
                pw.println("添加失败");
                pw.close();
            }
        }
    }
}
