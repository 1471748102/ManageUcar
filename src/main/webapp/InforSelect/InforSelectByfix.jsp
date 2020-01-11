<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/9
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="selectbyfix" method="post">
    <s:textfield name="carfix" label="查询修理次数小于 "/>
    <s:textfield name="sy" value="carfix" style="display:none;"/>
    <s:submit/>
</s:form>
</body>
</html>
