<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/6
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>query all records</title>
</head>
<body>
<%@include file="../../../../hello5/conn.jsp" %>
<%
    String sql = "select * from user ";
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
%>
<table border="1">
    <% while (rs.next()) {%>
    <tr>
        <td><%=rs.getInt("id")%></td>
        <td><%=rs.getString("username") %></td>
        <td><%=rs.getString("password") %></td>
        <td><a href="do_delete.jsp?id=<%=rs.getInt("id")%>">Delete</a></td>
        <td><a href="do_edit.jsp?id=<%=rs.getInt("id")%>">Edit</a></td>
    </tr>
    <%}%>
    <%
        stmt.close();
        conn.close();
    %>
</table>
<a href="addAdmin.jsp">Add User</a>
</body>
</html>
