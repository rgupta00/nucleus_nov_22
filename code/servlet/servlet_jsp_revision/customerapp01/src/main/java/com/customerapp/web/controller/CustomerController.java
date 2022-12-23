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

    //:(
    public CustomerController() {
      customerService=new CustomerServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Cache-control","no-store");
        resp.setHeader("Pragma","no-cache");
        resp.setDateHeader("Expires", -1);

        String action=req.getParameter("action");
        if(action.equals("showall")) {
            List<Customer> customers = customerService.getAll();
            req.setAttribute("customerList", customers);
            RequestDispatcher rd = req.getRequestDispatcher("show.jsp");
            rd.forward(req, resp);
        }else  if(action.equals("addcustomer")){
            resp.sendRedirect("addcustomer.jsp");
        }else  if(action.equals("deleteCustomer")){
           Integer id=Integer.parseInt(req.getParameter("id").trim());
           customerService.deleteCustomer(id);
            resp.sendRedirect("customers?action=showall");
        }else  if(action.equals("updateCustomer")){
            Integer id=Integer.parseInt(req.getParameter("id").trim());
           Customer customer=customerService.getById(id);
           req.setAttribute("customer", customer);
           RequestDispatcher rd=req.getRequestDispatcher("updatecustomer.jsp");
           rd.forward(req, resp);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // name  | address  | mobile    | email
        Integer id=Integer.parseInt(req.getParameter("id").trim());
        String name=req.getParameter("name");
        String address=req.getParameter("address");
        String mobile=req.getParameter("mobile");
        String email=req.getParameter("email");
        //String name, String address, String mobile, String email
        Customer customer=new Customer(name, address, mobile, email);

        if(id==0){
            customerService.addCustomer(customer);
        }else{
            customerService.updateCustomer(id, customer);
        }
        resp.sendRedirect("customers?action=showall");//hamesha get per gayaga
    }
}
