<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/24
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.*,cap.db.DBCon" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("username");
    String pass = request.getParameter("password");
    String procedure = "{call updateByid(?,?,?)}";
    DBCon dbCon = new DBCon();
    int res = dbCon.doUpdata(procedure, new Object[]{name, pass, id});
    if (res > 0) {
        response.sendRedirect("call_query.jsp");
    } else {
        out.print("修改失败");
    }

%>
</body>
</html>
