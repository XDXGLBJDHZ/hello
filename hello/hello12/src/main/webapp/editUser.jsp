<%@ page import="data2.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/5/28
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = (User) session.getAttribute("user");
%>
<form action="user?action=update" method="post">
    <input type="text" name="id" value="<%=user.getId()%>">
    <input type="text" name="username" value="<%=user.getUsername()%>">
    <input type="password" name="password" value="<%=user.getPassword()%>">
    <input type="submit" value="更新">
</form>
</body>
</html>
