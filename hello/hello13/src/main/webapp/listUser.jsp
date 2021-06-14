<%@ page import="data2.util.PageBean" %>
<%@ page import="java.util.List" %>
<%@ page import="data2.bean.User" %>
<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/6/13
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    PageBean pageBean= (PageBean) session.getAttribute("pageBean");
    List<User> userList =pageBean.getList();
%>
<table>
    <%
        for (User user:userList){
    %>
    <tr>
        <td><%=user.getId()%></td>
        <td><%=user.getUsername()%></td>
        <td><%=user.getPassword()%></td>
    </tr>
    <%
        }
    %>

</table>
<tr>
    当前<%=pageBean.getPageNumber()%>
    共<%=pageBean.getTopPageNumber()%>
    <a href="userPage?action=list&pageNumber=<%=pageBean.getTopPageNumber()%>">首页</a>
    <a href="userPage?action=list&pageNumber=<%=pageBean.getNextPageNumber()%>">下一页</a>
    <a href="userPage?action=list&pageNumber=<%=pageBean.getPreviousPageNumber()%>">上一页</a>
    <a href="userPage?action=list&pageNumber=<%=pageBean.getBottomPageNumber()%>">尾页</a>
</tr>
</body>
</html>
