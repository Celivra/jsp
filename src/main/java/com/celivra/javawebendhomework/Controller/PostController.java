package com.celivra.javawebendhomework.Controller;

import com.celivra.javawebendhomework.Model.Post;
import com.celivra.javawebendhomework.Service.PostService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "post", urlPatterns = {"/post"})
public class PostController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        if (idStr != null) {
            Long id = Long.parseLong(idStr);
            Post post = PostService.findPostById(id); // 从数据库获取
            request.setAttribute("post", post);
            request.getRequestDispatcher("/WEB-INF/view/PostDetail.jsp").forward(request, response);
        }
    }

}
