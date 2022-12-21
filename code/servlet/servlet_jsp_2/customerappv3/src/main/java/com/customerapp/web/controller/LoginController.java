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

public class LoginController extends HttpServlet {

    private UserService userService;

    public LoginController(){
        userService=new UserServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name=request.getParameter("name");
        String password=request.getParameter("password");

      try{
          User user=userService.getUser(name, password);
          HttpSession httpSession=request.getSession();
          httpSession.setAttribute("user", user);
          response.sendRedirect("showAll");
      }catch (UserNotFoundException ex){
          response.sendRedirect("login.jsp?error=login failed");
      }

    }
}





