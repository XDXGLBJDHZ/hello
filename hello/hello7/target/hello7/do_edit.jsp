<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/13
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="cap.db.DBCon ,java.sql.*" %>
<html>
<head>
    <title>do_edit</title>
</head>
<body>
    <%
        int id =Integer.parseInt(request.getParameter("id"));
        DBCon dbCon =new DBCon();
        String sql = "select * from user where id=?";
        ResultSet rs = dbCon.doquery(sql ,new Object[]{id});
        if (rs.next()){
    %>
    <form action="do_Update.jsp" method="post">
        <input type="hidden" name="new_id" value="<%=rs.getInt("id")%>">
        <input type="text" name="new_username" value="<%=rs.getString("username")%>">
        <input type="text" name="new_password" value="<%=rs.getString("password")%>">
        <input type="submit" value="提交">
    </form>
    <%
        }
        dbCon.close();
    %>
</body>
</html>
