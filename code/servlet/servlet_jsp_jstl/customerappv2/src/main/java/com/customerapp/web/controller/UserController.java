package com.customerapp.web.controller;

import com.customerapp.dao.customer.Customer;
import com.customerapp.dao.user.User;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;
import com.customerapp.service.UserService;
import com.customerapp.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserController extends HttpServlet {

    private UserService userService;

    public UserController(){
        userService=new UserServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        if (action.equals("adduser")){
            resp.sendRedirect("adduser.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // name         | address     | mobile        | email
      //  Integer id=Integer.parseInt(req.getParameter("id").trim());
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        String profile=req.getParameter("profile");

        User user=new User(name, password, profile);

        userService.addUser(user);

        resp.sendRedirect("customer.do?action=showall");
    }
}
