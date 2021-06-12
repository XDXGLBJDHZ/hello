<html>
<body>
<h2>首页</h2>
<%
    String flag = (String) session.getAttribute("flag");
    if (flag != null) {
        String name = (String) session.getAttribute("u");
        out.print("欢迎" + name);
    } else {
        out.print("请先登录一次");
        response.sendRedirect("login.jsp");
    }
%>
</body>
</html>
