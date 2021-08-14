<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/8/6
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/data1.action" method="post">
  username:<input name="username" type="text"><br>
  password:<input name="password" type="password"><br>
  address:<input name="address" type="text"><br>
  <input type="submit" value="提交">
</form>
</body>
</html>
