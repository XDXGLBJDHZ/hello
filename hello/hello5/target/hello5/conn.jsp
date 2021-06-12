<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/6
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>MySQL</title>
</head>
<body>
<%
    String dbDriver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/data2";
    String dbUser = "root";
    String dbpassword = "toor";
    Connection conn = null;
    Class.forName(dbDriver);
    conn=DriverManager.getConnection(url,dbUser,dbpassword);
    if (conn!=null){
        out.print("databases connect successful");
    }else{
        out.print("databases connect failed");
    }

%>
</body>
</html>
