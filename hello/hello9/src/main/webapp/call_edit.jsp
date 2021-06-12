<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/21
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="cap.db.DBCon,java.util.*,java.sql.*" %>
<html>
<head>
    <title>call_edit</title>
</head>
<body>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    String procedure = "{call findByid(?)}";
    DBCon dbCon = new DBCon();
    ResultSet rs = dbCon.doquery(procedure, new Object[]{id});
    if (rs.next()) {
%>
<form action="call_update.jsp" method="post">
    <input type="hidden" name="id" value="<%=rs.getInt("id")%>">
    <input type="text" name="username" value="<%=rs.getString("username")%>">
    <input type="text" name="password" value="<%=rs.getString("password")%>">
    <input type="submit" value="更新">
</form>
<%
    }
%>
</body>
</html>

