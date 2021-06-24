<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/9
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.*,cap.db.DBCon" %>
<html>
<head>
    <title>SQL Injection</title>
</head>
<body>
<%
    DBCon dbCon = new DBCon();
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String sql = " select * from user where username='" + username + "' and password='" + password + "' ";
    ResultSet rs = dbCon.doquery(sql);
%>
<table>
    <%while (rs.next()) {%>
    <tr>
        <td><%=rs.getInt("id")%>
        </td>
        <td><%=rs.getString("username")%>
        </td>
        <td><%=rs.getString("password")%>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
