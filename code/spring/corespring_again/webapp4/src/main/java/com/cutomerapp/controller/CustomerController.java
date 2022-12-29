package com.cutomerapp.controller;

import com.cutomerapp.dao.Customer;
import com.cutomerapp.service.CustomerService;
import com.cutomerapp.service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
//@WebServlet("/addCustomer")
public class CustomerController extends HttpServlet {

    private CustomerService customerService=new CustomerServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/customer.jsp");
        rd.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String addr = request.getParameter("addr");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");

        //public Customer(String name, String address, String mobile, String email)
        Customer customer=new Customer(name, addr, mobile, email);
        customerService.addCustomer(customer);

      // request.setAttribute("customer", customer);
        HttpSession  httpSession=request.getSession();
        httpSession.setAttribute("customer",customer);
        response.sendRedirect("successController");
       // response.sendRedirect("/WEB-INF/views/show.jsp");
//        RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/show.jsp");
//        rd.forward(request,response);
    }
}
