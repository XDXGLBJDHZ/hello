<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/6
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="cap.db.DBCon,java.util.*" %>

<html>
<head>
    <title>query all records2</title>
</head>
<body>
<%
    DBCon dbc = new DBCon();
    String sql = "select * from user";
    ResultSet rs = dbc.doquery(sql, new Object[] {});
%>
<table>
    <% while (rs.next()) {%>
    <tr>
        <td><%=rs.getInt("id")%></td>
        <td><%=rs.getString("username") %></td>
        <td><%=rs.getString("password") %></td>
        <td><a href="do_delete.jsp?id=<%=rs.getInt("id")%>">Delete</a></td>
        <td><a href="do_edit.jsp?id=<%=rs.getInt("id")%>">Edit</a></td>
    </tr>
    <%}%>
</table>
<a href="addAdmin.jsp">Add User</a>
</body>
</html>
