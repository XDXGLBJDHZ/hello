<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/3/24
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" buffer="16kb" %>
<%@ page import="com.unit2.Animal" %>
<html>
<head>
    <title>pageimprt</title>
</head>
<body>
<%
    Animal dog =new Animal(20,"老黑",130,"白色");
%>
这只狗身长<%=dog.getHeight()%>厘米，而且<%=dog.getAge()%>岁了，它是<%=dog.getColor()%>的<%=dog.getName()%>
</body>
</html>
