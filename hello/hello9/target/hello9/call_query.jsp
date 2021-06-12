<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/21
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="cap.db.DBCon" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    DBCon dbCon = new DBCon();
    String procedure = "call findall()";
    ResultSet rs = dbCon.doquery(procedure, new Object[]{});
%>
<table border="1">
    <%while (rs.next()) {%>
    <tr>
        <td><%=rs.getInt("id")%>
        </td>
        <td><%=rs.getString("username")%>
        </td>
        <td><%=rs.getString("password")%>
        </td>
        <td><a href="call_edit.jsp?id=<%=rs.getInt("id") %>">修改</a></td>
        <td><a href="call_delete.jsp?id=<%=rs.getInt("id") %>">删除</a></td>
    </tr>
    <%}%>
</table>
<a href="addAdmin.jsp">Add</a>
</body>
</html>
