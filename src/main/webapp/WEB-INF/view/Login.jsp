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
  <title>Login</title>
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
    <h2>用户登入</h2>
    <input type="text" placeholder="用户名" />
    <input type="password" placeholder="密码" />
    <button onclick="alert('登入成功')">登入</button>
  </div>

</body>
</html>
