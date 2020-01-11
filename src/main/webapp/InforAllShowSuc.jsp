<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/9
  Time: 15:23
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
            <td colspan="2">操作</td>
        </tr>
        <s:iterator value="InforListX" var="ina">
            <tr>
                <td><s:property value="#ina.getCarid()"/></td>
                <td><s:property value="#ina.getCartype()"/></td>
                <td><s:property value="#ina.getCarfix()"/></td>
                <td><s:property value="#ina.getWorn()"/></td>
                <td><s:property value="#ina.getContent()"/></td>
                <td><s:property value="#ina.getMoney()"/></td>
                <td><s:property value="#ina.getNumber()"/></td>
                <td><s:property value="#ina.getEmail()"/></td>
                <td><s:property value="#ina.getState()"/></td>
                <td>
                    <a href="inforbuy.action?carid=<s:property value="#ina.getCarid()"/>">确认购买</a>
                </td>
                <td>
                    <a href="inforshop.action?cis=<s:property value="#ina.getCarid()"/>">先添加到购物车</a>
                </td>

            </tr>
        </s:iterator>
    </table>
    <p>

        <br>
    <br>
    <br>
        <a href="/InforSelect/InforSelectByid.jsp"/>按照车牌精准查询车辆</a><br>
        <a href="/InforSelect/InforSelectByfix.jsp"/>按照修理次数模糊查询车辆</a><br>
        <a href="/InforSelect/InforSelectBytype.jsp"/>按照车辆类型模糊查询车辆</a><br>
</center>
</body>
</html>


