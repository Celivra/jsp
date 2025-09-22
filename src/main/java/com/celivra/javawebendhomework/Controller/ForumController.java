package com.celivra.javawebendhomework.Controller;

import com.celivra.javawebendhomework.Model.Post;
import com.celivra.javawebendhomework.Service.PostService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Forum", value = "/Forum")
public class ForumController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Post> postList = PostService.findAllPost();
        request.setAttribute("postList", postList);

        request.getRequestDispatcher("/WEB-INF/view/Forum.jsp").forward(request, response);
    }
}
