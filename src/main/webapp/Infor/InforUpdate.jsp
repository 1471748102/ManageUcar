<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/11
  Time: 9:59
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
    String carid=request.getParameter("carid");
    System.out.println(carid);
%>
<s:form action="inforupdate" method="post">
    您要修改的车牌号：
    <input type="textfield" name="care.carid" size=20  value =<%= carid %>>
    <s:textfield name="care.cartype" label="修改后车辆类型"/>
    <s:textfield name="care.carfix" label="修改后修理次数"/>
    <s:textfield name="care.worn" label="修改后磨损程度"/>
    <s:textfield name="care.content" label="修改后容量"/>
    <s:textfield name="care.money" label="修改后价格"/>
    <s:textfield name="care.number" label="修改后电话"/>
    <s:textfield name="care.email" label="修改后邮箱"/>
    <s:textfield name="care.state" label="修改后状态"/>
    <s:submit/>
</s:form>
</body>
</html>
