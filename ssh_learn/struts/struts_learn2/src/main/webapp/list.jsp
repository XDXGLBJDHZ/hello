<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/8/17
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/list.action" method="post">
    <!--0是指list集合中的第一个对象
    可同时封装多个对象
    -->
    <input type="text" name="list[0].id">
    <input type="text" name="list[0].username">
    <input type="text" name="list[0].password">
    <input type="submit" value="提交">
</form>
</body>
</html>
