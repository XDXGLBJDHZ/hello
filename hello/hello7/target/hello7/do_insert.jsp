<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/14
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*,cap.db.DBCon" %>
<head>
    <title>do_insert</title>
</head>
<body>
    <%
        String addname=request.getParameter("username");
        String addpassword=request.getParameter("password");
        DBCon dbCon =new DBCon();
        String sql="insert into user(username,password) value(?,?)";
        int res = dbCon.doUpdata(sql,new Object[]{addname,addpassword});
        if (res>0){
            response.sendRedirect("do_query.jsp");
        }else{
            out.print("add fail");
        }
    %>
</body>
</html>
