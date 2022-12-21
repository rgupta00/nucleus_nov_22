package com.customerapp.web.controller;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ShowAllCustomerController extends HttpServlet {

    private CustomerService customerService;

    public ShowAllCustomerController(){
        customerService=new CustomerServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Customer> customers=customerService.getAll();
        request.setAttribute("customerList",customers);
        RequestDispatcher rd=request.getRequestDispatcher("showall.jsp");
        rd.forward(request,response);

    }
}





