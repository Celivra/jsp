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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css">
</head>
<body>

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

  <form action="/doLogin" method="post">
  <div id="form-container">
    <h2>用户登入</h2>
      <input name="username" type="text" placeholder="输入用户名" />
      <input name="password" type="password" placeholder="输入密码" />

      <% if (request.getAttribute("NotFindUserInfo") != null){ %>
      <div class="LandrError">没有找到用户</div>
      <% }else if (request.getAttribute("PasswdError") != null){%>
      <div class="LandrError">密码错误</div>
      <%}%>
      <button>登入</button>
  </div>
  </form>

</body>
</html>
