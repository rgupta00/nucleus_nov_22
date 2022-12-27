package com.customerapp.controller;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomerController extends HttpServlet {

    private CustomerService customerService;

    public CustomerController(){
        customerService=new CustomerServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // name  | address | mobile    | email
        String name=req.getParameter("name");
        String address=req.getParameter("address");
        String mobile=req.getParameter("mobile");
        String email=req.getParameter("email");

        Customer customer=new Customer(name, address, mobile, email);

        customerService.addCustomer(customer);

        //requestDispahcer vs resp.sendredirect, PRG design pattern
        //after post redirect to get otherwise you would have double form subimssion problem
        resp.sendRedirect("success.jsp");



    }
}

















