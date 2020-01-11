<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/8
  Time: 23:15
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
            <td>姓名</td>
            <td>性别</td>
            <td>电话</td>
            <td>地址</td>
            <td>信用指数</td>
            <td colspan="2">操作</td>
        </tr>
        <s:iterator value="NormalList" var="norc">
            <tr>
                <td><s:property value="#norc.getUseid()"/></td>
                <td><s:property value="#norc.getUsename()"/></td>
                <td><s:property value="#norc.getUsesex()"/></td>
                <td><s:property value="#norc.getUsetel()"/></td>
                <td><s:property value="#norc.getUseaddress()"/></td>
                <td><s:property value="#norc.getUseindex()"/></td>
                <td>
                    <a href="del.action?useid=<s:property value="#norc.getUseid()"/>">删除</a>
                </td>
                <td>
                    <a href="/Normal/AdminUpdate.jsp?useid=<s:property value="#norc.getUseid()"/>">修改</a>
                </td>

            </tr>
        </s:iterator>
    </table>
    <p>
</center>
<center>
<a href="/Normal/NormalAdd.jsp"/>先去添加用户</a><br>
</center>
</body>
</html>
