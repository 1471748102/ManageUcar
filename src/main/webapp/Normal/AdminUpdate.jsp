<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/10
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String useid=request.getParameter("useid");
    System.out.println(useid);
    session.setAttribute("admin", "admin");
%>
<s:form action="AdminUpdate" method="post">
    您要修改的账号：
    <input type="textfield" name="nord.useid" size=20  value =<%= useid %>>
    <s:textfield name="nord.usename" label="修改后姓名"/>
    <s:textfield name="nord.usesex" label="修改后性别"/>
    <s:textfield name="nord.usetel" label="修改后电话"/>
    <s:textfield name="nord.useaddress" label="修改后地址"/>
    <s:textfield name="nord.useindex" label="修改后信用"/>
    <s:submit/>
</s:form>
</body>
</html>
