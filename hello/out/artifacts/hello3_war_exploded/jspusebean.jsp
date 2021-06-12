<%@ page import="bean.Admin" %><%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/3/26
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="bean.Admin" %>
<jsp:useBean id="admin" scope="page" class="bean.Admin"/>
<jsp:setProperty name="admin" property="*"/>

<html>
<head>
    <title>jspusebean</title>
</head>
<body>
你输入的是：<br>
username：
<jsp:getProperty name="admin" property="username"/>
<br>
password：
<jsp:getProperty name="admin" property="password"/>
<br>
</body>
</html>
