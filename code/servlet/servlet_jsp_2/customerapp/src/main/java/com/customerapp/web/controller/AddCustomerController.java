package com.customerapp.web.controller;
import java.io.IOException;
import java.util.*;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCustomerController extends HttpServlet {

    private CustomerService customerService;

    public AddCustomerController(){
        customerService=new CustomerServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name=request.getParameter("name");
        String address=request.getParameter("addr");
        String email=request.getParameter("email");
        String mobile=request.getParameter("mobile");

        Customer customer=new Customer(name,address,mobile,email);

        customerService.addCustomer(customer);

        response.sendRedirect("showAll");

    }
}





