<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/11
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="cap.db.*,java.sql.*" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
    <%
        int id=Integer.parseInt(request.getParameter("id"));
        DBCon dbCon =new DBCon();
        String sql="delete from user where id=?";
        int res = dbCon.doUpdata(sql,new Object[] {id});
        if (res>0){
            response.sendRedirect("do_query.jsp");
        }else {
            out.print("delete faile");
        }
    %>
</body>
</html>
