<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/5/2
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="data2.db.DBPool_c3p0,java.sql.*" %>

<html>
<head>
    <title>c3p0</title>
</head>
<body>
<%
    DBPool_c3p0 dbPool_c3p0 = new DBPool_c3p0();
    String sql = "select * from user order by id";
    ResultSet rs = dbPool_c3p0.doQuery(sql,new Object[]{});
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
</body>
</html>
