<%@ page import="java.util.List" %>
<%@ page import="data2.bean.Admin" %><%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/5/22
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Admin> adminList= (List<Admin>) session.getAttribute("admins");
%>
<table>
    <%
        for (Admin admin:adminList){
    %>
    <tr>
        <td><%=admin.getId()%></td>
        <td><%=admin.getUsername()%></td>
        <td><%=admin.getPassword()%></td>
        <td><a href="delete?action=delete&id=<%=admin.getId()%>">删除</a> </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
