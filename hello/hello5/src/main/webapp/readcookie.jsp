<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/4/6
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Cookie c =null;
        String name=null;
        Cookie cookies[]=request.getCookies();
        if (cookies!=null){
            for (int i =0;i<cookies.length;i++){
                c=cookies[i];
                if (c.getName().equals("user")){
                    name=c.getValue();
                }
            }
            if(name!=null){
                out.print(name+"获得15秒cookie存活时间");
            }else{
                out.print("cookie已失效");
            }
        }
    %>
</body>
</html>
