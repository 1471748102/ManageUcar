<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/8
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="bean.Normal" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String useid=request.getParameter("useid");
    System.out.println(useid);
    session.setAttribute("normal", "normal");
%>


<div id="main" style="width:100%;">

    <div id="left" style="width:50%;float:left;">
    <%
        List<Normal> list = (List<Normal>) request.getAttribute("nso");
        for (Normal nsop : list) {
    %>
    <br>您当前的账号：*****<%=nsop.getUseid() %>****
    <br>您当前的姓名：<%=nsop.getUsename() %>
    <br>你当前的性别：<%=nsop.getUsesex() %>
    <br>您当前的电话：<%=nsop.getUsetel()%>
    <br>您当前的地址：<%=nsop.getUseaddress() %>
    <br>您当前的信誉：<%=nsop.getUseindex() %>

    <%} %>
    <br>
    <br>
</div>
    <div id="right" style="width:50%;float:left;">
    您的UID账号为：<s:property value="#session.uid"/>
    <s:form action="NormalUpdate" method="post">
        <input type="hidden" name="nora.useid" value=<%=session.getAttribute("uid")%>>
        请输入您的修改信息：
        <s:textfield name="nora.usename" label="修改后姓名"/>
        <s:textfield name="nora.usesex" label="修改后性别"/>
        <s:textfield name="nora.usetel" label="修改后电话"/>
        <s:textfield name="nora.useaddress" label="修改后地址"/>
        <s:textfield name="nora.useindex" label="修改后信誉"/>
        <s:submit/>
    </s:form>
</div>
</div>
</body>
</html>



