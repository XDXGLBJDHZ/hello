<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/9
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SQL Injection</title>
</head>
<body>
<form action="do_login.jsp" method="post">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="submit" value="login">
</form>
</body>
</html>
