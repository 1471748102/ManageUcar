<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/9
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="selectbyid" method="post">
    <s:textfield name="carid" label="输入想查询的编号"/>
    <s:textfield name="sy" value="carid" style="display:none;"/>
    <s:submit/>
</s:form>
</body>
</html>
