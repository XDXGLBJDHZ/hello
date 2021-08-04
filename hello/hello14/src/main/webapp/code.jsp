<%--
  Created by IntelliJ IDEA.
  User: ME08I
  Date: 2021/6/30
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script type="text/javascript">
    function fresh() {
        var timestamp = new Date();
        document.getElementById("code").src="code?time="+timestamp;
    }
</script>
<form action="verify.jsp" method="post">
<img src="code" id="code"/><br>
<a href="#" onclick="fresh()">not clear</a>
<input type="text" name="ucode"><br>
<input type="submit" value="submit">
</form>
</body>
</html>
