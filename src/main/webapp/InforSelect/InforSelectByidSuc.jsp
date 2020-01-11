<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/9
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page import="bean.CarInfo" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="1200" border="9" align="center" cellpadding="15" cellspacing="0">
    <tr>
        <td colspan="9" align="center" valign="middle"><strong><font color="#FF00CC" size="4">所有车辆信息</font></strong></td>
    </tr>
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
    <tr>
            <%
    List<CarInfo> list=(List<CarInfo>)request.getAttribute("st");
    for(CarInfo p:list){
%>
    <tr align="center" valign="middle">
        <td><%=p.getCarid() %>
        </td>
        <td><%=p.getCartype() %>
        </td>
        <td><%=p.getCarfix() %>
        </td>
        <td><%=p.getWorn()%>
        </td>
        <td><%=p.getContent() %>
        </td>
        <td><%=p.getMoney() %>
        </td>
        <td><%=p.getNumber() %>
        </td>
        <td><%=p.getEmail() %>
        </td>
        <td><%=p.getState() %>
        </td>
    <tr>
            <%} %>
    <tr align="center" valign="middle">
        <td colspan="9">
            <%=1 %>
        </td>
    </tr>
</table>
<br>
<br>
<a href="/Index/ViewNormal.jsp"/>返回用户界面</a><br>
</body>
</html>
