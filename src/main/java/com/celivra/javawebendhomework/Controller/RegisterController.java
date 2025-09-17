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

        short flag = UserService.addUser(user);
        //1:success 2:same username 0:server Error
        if(flag ==2){
            request.setAttribute("SameUsername", true);
        }else if (flag ==0){
            request.setAttribute("ServerError", true);
        }
        request.getRequestDispatcher("/Register").forward(request, response);
    }
}
