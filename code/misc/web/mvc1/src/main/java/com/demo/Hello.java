package com.demo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Hello extends HttpServlet /* implements SingleThreadModel */ {
    //doGet vs doPost
    public   Hello(){
        System.out.println("ctr of hello servlet");
    }

    //life cycle of servelet
    //init ,service , destroy
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("init is called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        System.out.println("doget is called");
        String name=req.getParameter("name");
        String addresss=req.getParameter("add");
        PrintWriter out=resp.getWriter();
        out.print("hello to servlet api : "+ LocalDateTime.now()+"<br>");
        out.print("your name is : "+ name+"<br>");
        out.print("add is : "+ addresss+"<br>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy is called");
    }
}














