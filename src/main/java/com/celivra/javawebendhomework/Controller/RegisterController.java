package com.celivra.javawebendhomework.Controller;

import com.celivra.javawebendhomework.Model.User;
import com.celivra.javawebendhomework.Service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "doReg", value = "/doReg")
public class RegisterController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username, password);

        boolean flag = UserService.addUser(user);
        request.setAttribute("RegStatus", flag);
        request.getRequestDispatcher("/WEB-INF/view/Register.jsp").forward(request, response);
    }
}
