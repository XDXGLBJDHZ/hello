package data2.action;

import data2.bean.Admin;
import data2.db.DBCon;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/query")
public class AdminServlet extends HttpServlet {
    private DBCon dbCon= null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action =req.getParameter("action");
        if(action.equals("list")){
            try {
                dbCon =new DBCon();
                String sql="select * from user";
                ResultSet resultSet =dbCon.doQuery(sql,new Object[]{});
                List<Admin> adminList=new ArrayList<>();
                while (resultSet.next()){
                    Admin admin=new Admin();
                    admin.setId(resultSet.getInt("id"));
                    admin.setUsername(resultSet.getString("username"));
                    admin.setPassword(resultSet.getString("password"));
                    adminList.add(admin);
                }
                HttpSession session=req.getSession();
                session.setAttribute("admins",adminList);
                req.getRequestDispatcher("listAdmin.jsp").forward(req,resp);
            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                dbCon.close();
            }
        }else if (action.equals("delete")){
            int id = Integer.parseInt(req.getParameter("id"));
            try {
                dbCon = new DBCon();
                String sql = "delete from user where id=?";
                int result = dbCon.doUpdate(sql, new Object[]{id});
                if (result > 0) {
                    req.getRequestDispatcher("query").forward(req, resp);
                } else {
                    PrintWriter out = resp.getWriter();
                    out.println("删除失败");
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                dbCon.close();
            }
        }

    }
}
