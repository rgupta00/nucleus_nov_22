package com.cutomerapp.controller;

import com.cutomerapp.dao.Customer;
import com.cutomerapp.service.CustomerService;
import com.cutomerapp.service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ShowCustomerController extends HttpServlet {
    private CustomerService customerService;

    public ShowCustomerController(){
        customerService=new CustomerServiceImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Customer> customers=customerService.getAll();
        request.setAttribute("custList",customers);
        RequestDispatcher rd=request.getRequestDispatcher("allcustomers.jsp");
        rd.forward(request, response);
    }
}












