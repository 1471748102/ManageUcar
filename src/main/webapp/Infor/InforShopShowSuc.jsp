<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/10
  Time: 18:55
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
        <td colspan="9" align="center" valign="middle"><strong><font color="#FF00CC" size="4">购物车信息</font></strong></td>
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
    </tr>
    <%
        List<CarInfo> InforShopShow=(List<CarInfo>)request.getAttribute("InforShopShow");
        for(CarInfo shop:InforShopShow){
    %>
    <tr align="center" valign="middle" >
        <td><%=shop.getCarid() %></td>
        <td><%=shop.getCartype() %></td>
        <td><%=shop.getCarfix() %></td>
        <td><%=shop.getWorn()%></td>
        <td><%=shop.getContent() %></td>
        <td><%=shop.getMoney() %></td>
        <td><%=shop.getNumber() %></td>
        <td><%=shop.getEmail() %></td>
        <td><%=shop.getState() %></td>
    </tr>
    <%} %>

</table>
<center>
    <br>
    <br>
    <a href="/Infor/InforShopBuy.jsp"/>前去结算</a>

    <a href="/Infor/InforShopClear.jsp"/>清空购物车</a><br>
    <br><br>
    <a href="/Index/ViewNormal.jsp"/>返回用户界面</a><br>
</center>
</body>
</html>
