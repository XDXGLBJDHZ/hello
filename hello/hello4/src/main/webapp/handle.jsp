<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/1
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp内置对象request</title>
</head>
<meta charset="UTF-8">
<body>
<%
    request.setCharacterEncoding("utf-8");
    String str = request.getParameter("str");
    Object str2 = request.getAttribute("str");
    out.println(str2);
%>
<%=str%>
</body>
</html>
