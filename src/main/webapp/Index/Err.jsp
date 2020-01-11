<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/9
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Err</title>
</head>
<body>
<div style="text-align: center;">
登录失败，您的账号密码错误！
<a href="index.jsp"/>返回登录界面</a><br>
<br>

<span style="color:#ff342f">若您一秒内如果没有操作，就跳转至登录界面！</span>
<% response.setHeader("refresh", "3;URL=index.jsp"); %>
</div>
</body>
</html>
