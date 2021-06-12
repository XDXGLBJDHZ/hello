<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/1
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response page</title>
</head>
<body>
<%
    String opt = request.getParameter("opt");
    if (opt.equals("baidu")){
        response.sendRedirect("http://www.baidu.com");
    }
    if (opt.equals("souhu")){
        response.sendRedirect("http://www.sohu.com");
    }
    if (opt.equals("163")){
        response.sendRedirect("http://www.163.com");
    }
%>
</body>
</html>
