<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/8
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="del" method="post">
    <s:textfield name="useid" label="账号"/>
    <s:submit/>
</s:form>
</body>
</html>
