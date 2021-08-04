<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/6/30
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String scode = (String) session.getAttribute("scode");
    String ucode = request.getParameter("ucode");
    if (scode.equals(ucode)) {
        out.println("CodeisRight");
    } else {
        out.println("Correct is Wrong");
    }
%>
</body>
</html>
