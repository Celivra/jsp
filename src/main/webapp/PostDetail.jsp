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
    <title><title> - xx论坛</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/forum.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/post.css">
</head>
<body>
<div id="nav">
    <div id="siteName">xx論壇</div>
    <div id="searchBox">
        <form action="/ForumSearch" method="get">
            <input name="target" type="text" placeholder="🔍Search" />
        </form>
    </div>
    <div id="account">Account</div>
</div>
<div id="main">
    <div id="forumlist" style="width: 73%;">
        <div id="postBox">
            <div onclick="window.location.href='/'" id="backHome">< HOME</div>
            <div id="postTitle">temple</div>
            <div id="clickNum">观看次数：12</div>
            <div id="postContent">aaaaaaaaaaaa</div>
            <div id="postInfo">
                <div id="postPublisher">celivra</div>
                <div id="postDate">1937-07-07 12:45</div>
            </div>
        </div>
    </div>
    <div id="content">
        <h2>Content us</h2>
        <p>52xiaozhai@proton.me</p>
    </div>
</div>
</body>
</html>
