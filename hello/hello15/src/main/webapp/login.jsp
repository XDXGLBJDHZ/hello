<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/7/7
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String error= (String) session.getAttribute("error");
    if (error!=null){
%>
<%=error%>
<%
    }
    session.removeAttribute("error");
%>
<form action="login" method="post">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="submit" value="login">
</form>
</body>
</html>
