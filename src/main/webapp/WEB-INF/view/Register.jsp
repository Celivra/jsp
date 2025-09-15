<%--
  Created by IntelliJ IDEA.
  User: Celivra
  Date: 2025/9/15
  Time: 下午10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/landr.css">
</head>
<body>
    <div id="nav">
        <div onclick="window.location.href='/'" id="home">首页</div>
        <div id="landr">
            <div onclick="window.location.href='/Login'" id="login">登入</div>
            <div onclick="window.location.href='/Register'" id="register">注册</div>
        </div>
    </div>

    <div id="form-container">
        <h2>用户注册</h2>
        <input type="text" placeholder="用户名" />
        <input type="email" placeholder="邮箱" />
        <input type="password" placeholder="密码" />
        <input type="password" placeholder="确认密码" />
        <button onclick="alert('注册成功')">注册</button>
    </div>

</body>
</html>
