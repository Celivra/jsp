package com.celivra.javawebendhomework.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LoginController",urlPatterns= {
        "/Login","/login","/LOGIN",
        "/Register","/Reg","/register","/reg",
        "/Dashboard","/dashboard"
})
public class PageController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
            case "/Dashboard":
            case "/dashboard":
                request.getRequestDispatcher("/WEB-INF/view/Dashboard.jsp").forward(request, response);
                break;
        }
    }
}
