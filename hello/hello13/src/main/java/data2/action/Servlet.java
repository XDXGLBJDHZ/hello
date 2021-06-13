package data2.action;

import data2.service.Userservcie;
import data2.service.impl.UserServiceImpl;
import data2.util.PageBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userPage")
public class Servlet extends HttpServlet {
    Userservcie userservcie = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equals("list")) {
            String str = req.getParameter("pageNumber");
            int pageNumber;
            if (str == null) {
                pageNumber = 1;
            } else {
                pageNumber = Integer.parseInt(str);
            }
            PageBean pageBean = null;
            try {
                pageBean = userservcie.findByPage(pageNumber, 5);
            } catch (Exception e) {
                e.printStackTrace();
            }
            req.getSession().setAttribute("pageBean", pageBean);
            req.getRequestDispatcher("listUser.jsp").forward(req, resp);
        }
    }
}
