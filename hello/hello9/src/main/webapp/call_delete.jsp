<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/21
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="cap.db.DBCon" %>
<html>
<head>
    <title>call_delete</title>
</head>
<body>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    DBCon dbCon = new DBCon();
    String procedure = "{call delByid(?)}";
    int res = dbCon.doUpdata(procedure, new Object[]{id});
    if (res > 0) {
        response.sendRedirect("call_query.jsp");
    } else {
        out.print("删除失败");
    }
%>
</body>
</html>
