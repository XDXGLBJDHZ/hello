<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/9/2
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.service.HelloWorld" %>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<html>
<head>
    <title>采用XmlWebApplicationContext加载spring的配置文件</title>
</head>
<body>
<%
ServletContext servletContext=request.getSession().getServletContext();
ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext );
HelloWorld helloWord=(HelloWorld)ctx.getBean("hello");
String str=helloWord.sayHi("yzk");
%>
<%=str%>
</body>
</html>
