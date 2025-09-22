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
this is <%=post.getId()%>
</body>
</html>
