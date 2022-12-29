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

//@WebServlet("/addCustomer")
public class SuccessController extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/show.jsp");
        rd.forward(request, response);
    }

}
