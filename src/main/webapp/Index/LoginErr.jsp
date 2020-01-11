<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/9
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Err</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            background: #060c21;
            font-family: 'Poppins', sans-serif;
        }
        .box {
            position: relative;
            width: 300px;
            height: 400px;
            display: flex;
            justify-content: center;
            align-items: center;
            background: #060c21;
        }
        /* 用box的伪元素添加一个面积比box略大的矩形,并通过改变层叠次序,置于box的下层,达到给box设置边框的效果 */
        .box::before {
            content: '';
            position: absolute;
            top: -2px;
            left: -2px;
            right: -2px;
            bottom: -2px;
            background: #fff;
            z-index: -1;
        }
        /* 于上面类似,做一个面积比box略大的矩形,并通过改变层叠次序,置于box的下层,达到给box设置边框的效果 */
        .box::after {
            content: '';
            position: absolute;
            top: -2px;
            left: -2px;
            right: -2px;
            bottom: -2px;
            background: #fff;
            z-index: -2;
            /* 滤镜属性  给图像设置高斯模糊。"radius"一值设定高斯函数的标准差，或者是屏幕上以多少像素融在一起，所以值越大越模糊；如果没有设定值，则默认是0；这个参数可设置css长度值，但不接受百分比值。 */
            filter: blur(40px);
        }
        .box::before,
        .box::after {
            /* linear-gradient() 函数用于创建一个线性渐变的 "图像"。 参数1:用角度值指定渐变的方向（或角度）  12点钟方向为0deg*/
            background: linear-gradient(235deg, #89ff00, #060c21, #00bcd4);
        }
        .content {
            padding: 20px;
            box-sizing: border-box;
            color: #fff;
        }
    </style>
</head>
<body>
<div class="box">
    <div class="content">
        <center>
            <h1>返回登录界面</h1>
        </center>
        <p>
            <br>
            <br>
            <span style="color:#ff342f">很抱歉！</span>
            <br>
            <span style="color:#ff342f">若您三秒内不退出，将跳转至登录界面！</span>
            <% response.setHeader("refresh", "3;URL=../index.jsp"); %>
        </p>

    </div>
</div>
</body>
</html>
