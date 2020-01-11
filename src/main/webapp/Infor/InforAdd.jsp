<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/11
  Time: 10:23
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
    <s:form action="inforadd" method="post">
        <s:textfield name="cared.carid" label="车牌号"/>
        <s:textfield name="cared.cartype" label="车辆类型"/>
        <s:textfield name="cared.carfix" label="修理次数"/>
        <s:textfield name="cared.worn" label="磨损程度"/>
        <s:textfield name="cared.content" label="容量"/>
        <s:textfield name="cared.money" label="价格"/>
        <s:textfield name="cared.number" label="电话"/>
        <s:textfield name="cared.email" label="邮箱"/>
        <s:textfield name="cared.state" label="状态"/>
        <s:submit/>
    </s:form>
</center>
</body>
</html>
