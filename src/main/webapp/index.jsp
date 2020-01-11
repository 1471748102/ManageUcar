<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/7
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Random" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="css.txt"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <meta name="description" content="particles.js is a lightweight JavaScript library for creating particles.">
    <meta name="author" content="Vincent Garreau" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" media="screen" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/reset.css"/>

    <title>注册</title>

    <script type="text/javascript">
        function newImage(){
            document.getElementById("imgid").src="ImageServlet?d="+new Date().getTime();
        }
    </script>

</head>
<body>
<%! public String main() {
    String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    StringBuilder sb=new StringBuilder(4);
    for(int i=0;i<4;i++){
        char ch=str.charAt(new Random().nextInt(str.length()));
        sb.append(ch);
    }
    return sb.toString();
}
%>
<br>
<br>
<br>
<br>
<div id="particles-js">
    <font size=3>
<center>

    <br> <br> <br>
    <br> <br> <br>
    <br> <br> <br>
    <font size=5>车辆交易网站</font>
    <br> <br>

<s:debug/>
<s:form action="CheckAction" method="post">
    账号：<input type="text" name="uk.name" />
    <br>
    <br>
    密码：<input type="text" name="uk.password" />
    <%
        String yanZheng=main();
    %>
    <br>
    <%=yanZheng%><br> <a href="index.jsp">看不清换一张</a><br> <label>验证码</label>
    <input type="text" name="ms.word"><br>
    <input type="hidden" name="ms.yanZheng" value="<%=yanZheng %>">
    &nbsp
    &nbsp
    <input type="radio" value="normal" name="ms.p1" />普通用户
    <input type="radio" value="admin" name="ms.p2" />管理员 <br>
    <input type="submit" value="登录" name="yes">
    &nbsp
    &nbsp
    <input type="reset" value="重置" name="no">

</s:form>
    <span style="color:#2728ff"><s:fielderror name="uka"></s:fielderror></span>
<br>
<br>
<br>
<a href="Login.jsp"/>没有账号？先去注册一个</a><br>
</center>
    </font>
</div>
<!-- scripts -->
<script src="js/particles.min.js"></script>
<script src="js/app.js"></script>
<script type="text/javascript">
    function hasClass(elem, cls) {
        cls = cls || '';
        if (cls.replace(/\s/g, '').length == 0) return false; //当cls没有参数时，返回false
        return new RegExp(' ' + cls + ' ').test(' ' + elem.className + ' ');
    }

    function addClass(ele, cls) {
        if (!hasClass(ele, cls)) {
            ele.className = ele.className == '' ? cls : ele.className + ' ' + cls;
        }
    }

    function removeClass(ele, cls) {
        if (hasClass(ele, cls)) {
            var newClass = ' ' + ele.className.replace(/[\t\r\n]/g, '') + ' ';
            while (newClass.indexOf(' ' + cls + ' ') >= 0) {
                newClass = newClass.replace(' ' + cls + ' ', ' ');
            }
            ele.className = newClass.replace(/^\s+|\s+$/g, '');
        }
    }
    document.querySelector(".login-button").onclick = function(){
        addClass(document.querySelector(".login"), "active")
        setTimeout(function(){
            addClass(document.querySelector(".sk-rotating-plane"), "active")
            document.querySelector(".login").style.display = "none"
        },800)
        setTimeout(function(){
            removeClass(document.querySelector(".login"), "active")
            removeClass(document.querySelector(".sk-rotating-plane"), "active")
            document.querySelector(".login").style.display = "block"
        },5000)
    }
</script>
</body>
</html>
