<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/6
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("username");
    Cookie c =new Cookie("user",name);
    c.setMaxAge(15);
    response.addCookie(c);
    response.sendRedirect("readcookie.jsp");
%>
</body>
</html>
