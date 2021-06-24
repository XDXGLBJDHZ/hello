<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/5/26
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="data2.bean.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<User> userList= (List<User>) session.getAttribute("admins");
%>
<table>
    <%
        for(User user:userList){
    %>
    <tr>
        <td><%=user.getId()%></td>
        <td><%= user.getUsername()%></td>
        <td><%=user.getPassword()%></td>
        <td><a href="user?action=del&id=<%=user.getId() %>">删除</a></td>
        <td><a href="user?action=edit&id=<%=user.getId() %>">编辑</a></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
