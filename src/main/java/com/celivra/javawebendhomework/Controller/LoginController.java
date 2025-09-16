package com.celivra.javawebendhomework.Controller;

import com.celivra.javawebendhomework.Model.User;
import com.celivra.javawebendhomework.Service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "doLogin", value = "/doLogin")
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = UserService.getUserByName(username);

        if(user == null){
            req.getSession().setAttribute("NotFindUserInfo", true);
            resp.sendRedirect("/Login");
            return;
        }

        if(user.getPassword().equals(password)){
            req.getSession().setAttribute("user", user);
            resp.sendRedirect("/Dashboard");
        }
        else{
            resp.sendRedirect("/Login");
        }

    }
}
