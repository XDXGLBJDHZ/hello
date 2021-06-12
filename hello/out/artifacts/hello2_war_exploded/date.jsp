<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/3/24
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Date date =new Date();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd");
        String strtime=simpleDateFormat.format(date);
        long time=date.getTime();
    %>
    1970年到现在：<%=time%><br>
    当前时间为：<%=strtime%>
</body>
</html>
