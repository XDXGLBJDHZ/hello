<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/8/1
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>
<s:bean name="cap.bean.Admin" var="admin">
    <s:param name="username" value="admin.getUsername()"/>
</s:bean>
<s:push value="#admin">
    欢迎<s:property value="username"/>
</s:push>

</body>
</html>
