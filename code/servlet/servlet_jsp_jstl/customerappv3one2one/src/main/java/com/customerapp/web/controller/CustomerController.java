package com.customerapp.web.controller;

import com.customerapp.dao.customer.Address;
import com.customerapp.dao.customer.Customer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class CustomerController extends HttpServlet {
    private CustomerService customerService;
    public CustomerController(){
         customerService=new CustomerServiceImpl();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        if (action.equals("showall")) {
            List<Customer> customers = customerService.getAll();
            req.setAttribute("customerList", customers);
            RequestDispatcher rd = req.getRequestDispatcher("showall.jsp");
            rd.forward(req, resp);
        }else if(action.equals("addcustomer")){
            resp.sendRedirect("addcustomer.jsp");
        }else if(action.equals("deleteCustomer")){
            Integer id=Integer.parseInt(req.getParameter("id").trim());
            customerService.deleteCustomer(id);
            resp.sendRedirect("customer.do?action=showall");
        }else if(action.equals("updateCustomer")){
            Integer id=Integer.parseInt(req.getParameter("id").trim());
              Customer customer=customerService.getById(id);
              req.setAttribute("customer",customer);//put the customer in the req scope and rd to updatecustomer.jsp
            RequestDispatcher rd=req.getRequestDispatcher("updatecustomer.jsp");
            rd.forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // name         | address     | mobile        | email
        Integer id=Integer.parseInt(req.getParameter("id").trim());
        String name=req.getParameter("name");
        String mobile=req.getParameter("mobile");
        String email=req.getParameter("email");

        String state=req.getParameter("state");
        String country=req.getParameter("country");


        Address address=new Address(state,country);
        Customer customer=new Customer(name, address, mobile, email);

        if(id==0) {
            customerService.addCustomer(customer);
        }else {
            customerService.updateCustomer(id, customer);
        }

        resp.sendRedirect("customer.do?action=showall");

    }
}
