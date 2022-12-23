package com.customerapp.controller;

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

public class CustomerController extends HttpServlet {

    private CustomerService customerService;

    //:(
    public CustomerController() {
      customerService=new CustomerServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        if(action.equals("showall")) {
            List<Customer> customers = customerService.getAll();
            req.setAttribute("customerList", customers);
            RequestDispatcher rd = req.getRequestDispatcher("show.jsp");
            rd.forward(req, resp);
        }else  if(action.equals("addcustomer")){
            resp.sendRedirect("addcustomer.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // name  | address  | mobile    | email
        String name=req.getParameter("name");
        String address=req.getParameter("address");
        String mobile=req.getParameter("mobile");
        String email=req.getParameter("email");
        //String name, String address, String mobile, String email
        Customer customer=new Customer(name, address, mobile, email);
        customerService.addCustomer(customer);

        resp.sendRedirect("customers?action=showall");//hamesha get per gayaga
    }
}
