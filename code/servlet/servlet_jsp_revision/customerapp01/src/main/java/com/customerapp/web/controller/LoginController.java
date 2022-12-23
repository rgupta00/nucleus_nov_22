package com.customerapp.web.controller;

import com.customerapp.dao.user.User;
import com.customerapp.exceptions.UserNotFoundException;
import com.customerapp.service.UserService;
import com.customerapp.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginController extends HttpServlet {

    private UserService userService;

    public LoginController(){
        userService=new UserServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String username= req.getParameter("username");
        String password= req.getParameter("password");
        String profile= req.getParameter("profile");

       try{
           User user=userService.validateUser(username, password, profile);
           HttpSession httpSession=req.getSession();
           httpSession.setAttribute("user", user);
           resp.sendRedirect("customers?action=showall");
       }catch (UserNotFoundException ex){
           resp.sendRedirect("login.jsp?error=login failed");
       }

    }
}
