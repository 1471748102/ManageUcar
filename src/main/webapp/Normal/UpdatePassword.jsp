<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/10
  Time: 15:05
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
您的登陆账号为：<s:property value="#session.YouName"/>
<s:form action="updatepassword" method="post" align="center">
    <input type="hidden" name="name" value=<%=session.getAttribute("YouName")%>>
    <s:textfield name="NewPassword" label="请您输入修改后密码" align="center"/>
    <s:submit align="center"/>
</s:form>
</center>
</body>
</html>
