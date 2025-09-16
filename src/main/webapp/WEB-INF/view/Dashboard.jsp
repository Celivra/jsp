<%@ page import="com.celivra.javawebendhomework.Model.User" %><%--
  Created by IntelliJ IDEA.
  User: Celivra
  Date: 2025/9/16
  Time: 下午4:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    User user = null;
%>
<%
    user = (User)request.getSession().getAttribute("user");
    System.out.println(user.toString());
    if (user == null){
        response.sendRedirect("/Login");
    }
%>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    Welcome&nbsp; <%=user.getUsername()%>
    Your password is <%=user.getPassword()%>
</body>
</html>
