<%@ page import="cap.db.DBCon" %>
<%@ page import="javax.xml.transform.Result" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/13
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    int id = Integer.parseInt(request.getParameter("new_id"));
    String newUsername = new String(request.getParameter("new_username"));
    String newPassword = new String(request.getParameter("new_password"));
    DBCon dbCon = new DBCon();
    String sql = "update user set username=?,password=? where id=?";
    int res = dbCon.doUpdata(sql, new Object[]{newUsername, newPassword, id});
    if (res > 0) {
        response.sendRedirect("do_query.jsp");
    } else {
        out.print("update failure");
    }
%>
</body>
</html>
