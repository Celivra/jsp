<%@ page import="com.celivra.javawebendhomework.Model.Post" %><%--
  Created by IntelliJ IDEA.
  User: celivra
  Date: 2025/9/22
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Post post = (Post) request.getAttribute("post");
%>
<html>
<head>
    <title><%=post.getTitle()%> - xx论坛</title>
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
            <div onclick="window.location.href='/Forum'" id="backHome">< HOME</div>
            <div id="postTitle"><%=post.getTitle()%></div>
            <div id="postInfo">
                <div id="postPublisher"><%=post.getPublisherName()%></div>
                <div>&nbsp;发布于&nbsp;</div>
                <div id="postDate"><%=post.getFormattedDateTime()%></div>
            </div>
            <div id="postContent"><%=post.getContent()%></div>
        </div>
        <div id="comment">
            <textarea placeholder="评论"></textarea>
            <div id="commentSend">发送</div>
        </div>
        <div id="comments">

        </div>
    </div>
    <div id="content">
        <h2>Content us</h2>
        <p>52xiaozhai@proton.me</p>
    </div>
</div>
</body>
</html>
