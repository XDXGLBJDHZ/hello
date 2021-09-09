<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/8/17
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>map</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/map.action" method="post">
    <!--设置key的值map['key']
    设置value的值
    -->
    <input type="text" name="map['one'].id">
    <input type="text" name="map['one'].username">
    <input type="text" name="map['one'].password">
    <input type="submit" value="提交">
</form>
</body>
</html>
