<%@ page import="data2.data2.dao.AdminDao" %>
<%@ page import="data2.data2.dao.impl.AdminDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/5/15
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username= request.getParameter("username");
    String password=request.getParameter("password");
    AdminDao adminDao=new AdminDaoImpl();
    int result=adminDao.login(username,password);
    if (result==1){
        response.sendRedirect("index.jsp");
    }else {
        out.print("用户名或密码输入错误");
    }
%>>
</body>
</html>
