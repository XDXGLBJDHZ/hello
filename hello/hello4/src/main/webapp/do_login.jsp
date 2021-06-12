<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/2
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session</title>
</head>
<body>
<%
    String name = request.getParameter("username");
    String pass = request.getParameter("password");
    if (name != null && pass != null) {
        if (name.equals("root") && pass.equals("toor")) {
            session.setAttribute("u", name);
            session.setAttribute("flag", pass);
//            session.setMaxInactiveInterval(15);
            response.sendRedirect("index.jsp");
        } else {
            out.println("密码或账户输入错误，请再次输入");
        }

    }

%>
</body>
</html>
