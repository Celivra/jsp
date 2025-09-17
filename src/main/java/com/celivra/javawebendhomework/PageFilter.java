package com.celivra.javawebendhomework;

import com.celivra.javawebendhomework.Model.User;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(filterName = "GreatFireWall", urlPatterns = {"/Dashboard"})
public class PageFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession(false);

        User user = (User) request.getSession().getAttribute("user");
        if (session == null || user == null) {
            System.out.println("filter:not logged in");
            response.sendRedirect(request.getContextPath() + "/Login");
        }else{
            System.out.println("filter:logged in");
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
