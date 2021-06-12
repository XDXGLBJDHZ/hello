<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/25
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="cap.db.DBCon,java.sql.*" %>
<html>
<head>
    <title>addAdmin</title>
</head>
<body>
<%
    String newusername = request.getParameter("username");
    String newpass = request.getParameter("password");
    DBCon dbCon = new DBCon();
    String procedure = "{call addAdmin(?,?)}";
    int res = dbCon.doUpdata(procedure, new Object[]{newusername, newpass});
    if (res > 0) {
        response.sendRedirect("call_query.jsp");
    } else {
        out.print("添加失败");
    }
%>
</body>
</html>
