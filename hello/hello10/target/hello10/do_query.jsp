<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/5/2
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="data2.db.DBCon,java.sql.*" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    DBCon dbCon = new DBCon();
    String sql = "select * from user order by id";
    ResultSet rs = dbCon.doQuery(sql,new Object[]{});
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
