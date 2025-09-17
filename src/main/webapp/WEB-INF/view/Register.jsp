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

    <form action="/doReg" method="post">
    <div id="form-container">
        <h2>用户注册</h2>
        <input name="username" type="text" placeholder="用户名" />
<%--        <input type="email" placeholder="邮箱" />--%>
        <input name="password" type="password" placeholder="密码" />
<%--        <input type="password" placeholder="确认密码" />--%>

        <% if (request.getAttribute("SameUsername") != null){ %>
        <div class="LandrError">这个用户名已经注册了</div>
        <% }else if (request.getAttribute("ServerError") != null){%>
        <div class="LandrError">服务器错误</div>
        <%}%>
        <button>注册</button>
    </div>
    </form>

</body>
</html>
