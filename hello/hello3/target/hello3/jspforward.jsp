<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/3/26
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP forward</title>
</head>
<body>
    <jsp:forward page="news.jsp"></jsp:forward>
    <%
       out.print(" 这行代码不会被执行");
    %>
</body>
</html>
