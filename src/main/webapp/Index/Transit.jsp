<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/9
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Transit</title>
</head>
<body>

<s:if test="#session.p1 == 'normal'">
    <% response.setHeader("refresh", "0;URL=Index/Bunding.jsp"); %>
</s:if>
<s:if test="#session.p2 == 'admin'">
    <% response.setHeader("refresh", "0;URL=Index/ViewAdmin.jsp"); %>
</s:if>
</body>
</html>
