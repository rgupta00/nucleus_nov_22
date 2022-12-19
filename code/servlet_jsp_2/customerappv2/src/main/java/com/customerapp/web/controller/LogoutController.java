package com.customerapp.web.controller;

import com.customerapp.dao.exceptions.UserNotFoundException;
import com.customerapp.dao.user.User;
import com.customerapp.service.UserService;
import com.customerapp.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LogoutController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession httpSession=request.getSession(false);
        if (httpSession!=null){
            httpSession.invalidate();
        }
        response.sendRedirect("login.jsp?message=logout successful");

    }
}





