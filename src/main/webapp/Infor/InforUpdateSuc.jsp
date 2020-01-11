<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/11
  Time: 8:56
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

车牌号：<s:property value="care.carid"/><br>
车型：<s:property value="care.cartype"/><br>
修理次数：<s:property value="care.carfix"/><br>
磨损程度：<s:property value="care.worn"/><br>
容量：<s:property value="care.content"/><br>
价格：<s:property value="care.money"/><br>
电话：<s:property value="care.number"/><br>
邮箱：<s:property value="care.email"/><br>
状态：<s:property value="care.state"/><br>
<br>
<br>
<a href="/Index/ViewAdmin.jsp"/>返回管理员界面</a><br>
</body>
</html>

