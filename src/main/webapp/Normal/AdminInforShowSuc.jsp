<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/11
  Time: 9:30
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
        <s:iterator value="show2" var="inbb">
            <tr>
                <td><s:property value="#inbb.getCarid()"/></td>
                <td><s:property value="#inbb.getCartype()"/></td>
                <td><s:property value="#inbb.getCarfix()"/></td>
                <td><s:property value="#inbb.getWorn()"/></td>
                <td><s:property value="#inbb.getContent()"/></td>
                <td><s:property value="#inbb.getMoney()"/></td>
                <td><s:property value="#inbb.getNumber()"/></td>
                <td><s:property value="#inbb.getEmail()"/></td>
                <td><s:property value="#inbb.getState()"/></td>
                <td>
                    <a href="infordelete.action?carid=<s:property value="#inbb.getCarid()"/>">删除</a>
                </td>
                <td>
                    <a href="/Infor/InforUpdate.jsp?carid=<s:property value="#inbb.getCarid()"/>">修改</a>
                </td>

            </tr>
        </s:iterator>
    </table>

        <br>
        <br>
        <br>
    <a href="/Infor/InforAdd.jsp"/>先去添加车辆</a><br>
</center>
</body>
</html>
