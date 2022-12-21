package com.customerapp.web.controller;

import com.customerapp.dao.customer.Customer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CustomerController extends HttpServlet {

    private CustomerService customerService;

    public CustomerController(){
        customerService=new CustomerServiceImpl();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action=request.getParameter("action");
        if(action.equals("showall")) {
            List<Customer> customers = customerService.getAll();
            request.setAttribute("customerList", customers);
            RequestDispatcher rd = request.getRequestDispatcher("showall.jsp");
            rd.forward(request, response);
        }else if(action.equals("deleteCustomer")){
            Integer id=Integer.parseInt(request.getParameter("id"));
            customerService.deleteCustomer(id);
            response.sendRedirect("customer.do?action=showall");
        }else if(action.equals("updateCustomer")){
            Integer id=Integer.parseInt(request.getParameter("id"));
            Customer customer=customerService.getById(id);
            request.setAttribute("customer", customer);
           RequestDispatcher rd=request.getRequestDispatcher("updatecustomer.jsp");
           rd.forward(request,response);
        }else if(action.equals("addCustomer")){
           response.sendRedirect("addcustomer.jsp");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer id=Integer.parseInt(request.getParameter("id").trim());

        String name=request.getParameter("name");
        String address=request.getParameter("addr");
        String email=request.getParameter("email");
        String mobile=request.getParameter("mobile");

        Customer customer=new Customer(name,address,mobile,email);

        if(id==0) {
            customerService.addCustomer(customer);
        }else {
            customerService.updateCustomer(id,customer);
        }

        response.sendRedirect("customer.do?action=showall");
    }
}
