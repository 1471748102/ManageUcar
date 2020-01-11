<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/11
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <br>
    <br>
    <br>
    <table border="1">
        <tr align="center" valign="middle">
            <td>编号</td>
            <td>车型</td>
            <td>修理次数</td>
            <td>磨损程度</td>
            <td>容量</td>
            <td>金额</td>
            <td>联系电话</td>
            <td>邮箱</td>
            <td>状态</td>
            <td colspan="1">操作</td>
        </tr>
        <s:iterator value="shop" var="shopshowit">
            <tr>
                <td><s:property value="#shopshowit.getCarid()"/></td>
                <td><s:property value="#shopshowit.getCartype()"/></td>
                <td><s:property value="#shopshowit.getCarfix()"/></td>
                <td><s:property value="#shopshowit.getWorn()"/></td>
                <td><s:property value="#shopshowit.getContent()"/></td>
                <td><s:property value="#shopshowit.getMoney()"/></td>
                <td><s:property value="#shopshowit.getNumber()"/></td>
                <td><s:property value="#shopshowit.getEmail()"/></td>
                <td><s:property value="#shopshowit.getState()"/></td>
                <td>
                    <a href="buyshop.action?carid=<s:property value="#shopshowit.getCarid()"/>">确认发货</a>
                </td>

            </tr>
        </s:iterator>
    </table>
    <p>

        <br>
        <br>
        <br>
</center>
</body>
</html>
