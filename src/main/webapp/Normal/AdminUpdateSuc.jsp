<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/11
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Suc</title>
</head>
<body>
更新成功！<br>

账号：<s:property value="nord.useid"/><br>
姓名：<s:property value="nord.usename"/><br>
性别：<s:property value="nord.usesex"/><br>
电话：<s:property value="nord.usetel"/><br>
地址：<s:property value="nord.useaddress"/><br>
信誉：<s:property value="nord.useindex"/><br>
<br>
<br>
<a href="/Index/ViewAdmin.jsp"/>返回管理员界面</a><br>
</body>
</html>