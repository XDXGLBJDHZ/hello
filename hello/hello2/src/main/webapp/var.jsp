<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/3/24
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int sum = 0;
    for (int i = 0; i < 100; i++) {
        sum += 1;
    }
    out.print(sum);
%>

</body>
</html>
