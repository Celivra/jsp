<%@ page import="com.celivra.javawebendhomework.Model.Post" %><%--
  Created by IntelliJ IDEA.
  User: celivra
  Date: 2025/9/22
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  Post post = (Post) request.getAttribute("post");
%>
<h1><%=post.getTitle()%></h1>
<hr>
<p style="background-color: bisque"><%=post.getContent()%></p><br><br>
<div style="display: flex; justify-content: space-between">
    <div>发布人:<%=post.getPublisherName()%></div>
    <div>时间:<%=post.getFormattedDateTime()%></div>
</div>
</body>
</html>
