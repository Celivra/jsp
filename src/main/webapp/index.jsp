<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Main Page</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="stylesheet" type="text/css" href="css/common.css">
</head>
<body>
    <div id="box">
        <div id="nav">
            <div onclick="window.location.href='/'" id="home">首页</div>
            <div id="landr">
                <% if(request.getSession().getAttribute("user") != null){ %>
                <div onclick="window.location.href='/Dashboard'" id="dashboard">控制台</div>
                <%}else{%>
                <div onclick="window.location.href='/Login'" id="login">登入</div>
                <div onclick="window.location.href='/Register'" id="register">注册</div>
                <%}%>
            </div>
        </div>
        <div id="banner">
            <img src="img/banner.png"/>
        </div>
        <div id="content">
            <div id="text"></div>
        </div>
        <div id="bottom"></div>
    </div>
</body>
</html>