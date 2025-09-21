<%--
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
                <div class="post">
                    <div class="postName">test</div>
                    <div class="postDetails">
                        <div class="publisher">admin</div>
                        <div class="postDate">1937-07-07 14:00</div>
                    </div>
                </div>
                <div class="post">
                    <div class="postName">test</div>
                    <div class="postDetails">
                        <div class="publisher">admin</div>
                        <div class="postDate">1937-07-07 14:00</div>
                    </div>
                </div>
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
