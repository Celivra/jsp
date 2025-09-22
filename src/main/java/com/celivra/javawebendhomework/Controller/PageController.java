package com.celivra.javawebendhomework.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "PageController",urlPatterns= {
        "/Login","/login","/LOGIN",
        "/Register","/Reg","/register","/reg" })
public class PageController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MainBody(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MainBody(request, response);
    }
    public void MainBody(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch (path){
            case "/Login":
            case "/login":
            case "/LOGIN":
                request.getRequestDispatcher("/WEB-INF/view/Login.jsp").forward(request, response);
                break;
            case "/Register":
            case "/Reg":
            case "/register":
            case "/reg":
                request.getRequestDispatcher("/WEB-INF/view/Register.jsp").forward(request, response);
                break;
        }
    }
}
