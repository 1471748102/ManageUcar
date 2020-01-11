<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/11
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Suc</title>
</head>
<body>
插入信息成功！<br>

车牌号：<s:property value="cared.carid"/><br>
车型：<s:property value="cared.cartype"/><br>
修理次数：<s:property value="cared.carfix"/><br>
磨损程度：<s:property value="cared.worn"/><br>
容量：<s:property value="cared.content"/><br>
价格：<s:property value="cared.money"/><br>
电话：<s:property value="cared.number"/><br>
邮箱：<s:property value="cared.email"/><br>
状态：<s:property value="cared.state"/><br>
<br>
<br>
<a href="/Index/ViewAdmin.jsp"/>返回管理员界面</a><br>
</body>
</html>
