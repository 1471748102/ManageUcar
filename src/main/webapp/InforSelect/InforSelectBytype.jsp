<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/9
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="selectbytype" method="post">
    <s:textfield name="cartype" label="输入想查询的车型"/>
    <s:textfield name="sy" value="cartype" style="display:none;"/>
    <s:submit/>
</s:form>
</body>
</html>
