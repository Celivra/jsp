<%@ page import="com.celivra.javawebendhomework.Model.Post" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Celivra
  Date: 2025/9/16
  Time: 下午4:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forum</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/forum.css">
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
        <div id="tagbox">
            <div id="tag">
                <div>
                    <div class="tag">tag1</div>
                    <div class="tag">tag2</div>
                </div>
                <div>
                    <div class="tag">tag3</div>
                    <div class="tag">tag4</div>
                </div>
            </div>
            <div id="postButtom">POST</div>
        </div>
        <div id="forumlist">
            <div id="forumbox">
                <!--jsp create-->
                <%
                    List<Post> postList = (List<Post>) request.getAttribute("postList");
                    if (postList != null) {
                        for (Post post : postList) {
                %>
                <a href="<%= request.getContextPath() %>/post?id=<%= post.getId() %>">
                <div class="post">
                    <div class="postName"><%= post.getTitle() %></div>
                    <div class="clickNum">浏览量:<%=post.getClickNum()%></div>
                    <div class="postDetails">
                        <div class="publisher">发布人:<%= post.getPublisherName() %></div>
                        <div class="postDate"><%= post.getFormattedDateTime() %></div>
                    </div>
                </div>
                </a>
                <%
                        }
                    }
                %>
                <!--jsp-->
            </div>
        </div>
        <div id="content">
            <h2>Content us</h2>
            <p>52xiaozhai@proton.me</p>
        </div>
    </div>
</body>
</html>
