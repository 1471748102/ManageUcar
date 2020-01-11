<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/11
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
更新成功！<br>

账号：<s:property value="nora.useid"/><br>
姓名：<s:property value="nora.usename"/><br>
性别：<s:property value="nora.usesex"/><br>
电话：<s:property value="nora.usetel"/><br>
地址：<s:property value="nora.useaddress"/><br>
信誉：<s:property value="nora.useindex"/><br>
<br>
<br>
<a href="/Index/ViewNormal.jsp"/>返回用户界面</a><br>
</body>
</html>
