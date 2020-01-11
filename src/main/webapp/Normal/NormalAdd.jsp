<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/10
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<s:form action="normaladd" method="post">
    <s:textfield name="uuk.useid" label="账号"/>
    <s:textfield name="uuk.usename" label="姓名"/>
    <s:textfield name="uuk.usesex" label="性别"/>
    <s:textfield name="uuk.usetel" label="电话"/>
    <s:textfield name="uuk.useaddress" label="地址"/>
    <s:textfield name="uuk.useindex" label="信誉"/>
    <s:submit/>
</s:form>
</center>
</body>
</html>
