<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/8
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:debug/>
<s:form action="setup" >
    <s:textfield name="ua.name" label="账号"/>
    <s:textfield name="ua.password" label="密码"/>
    <s:submit/>
</s:form>
</body>
</html>
