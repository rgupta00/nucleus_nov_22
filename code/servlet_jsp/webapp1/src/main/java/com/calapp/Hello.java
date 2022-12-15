package com.calapp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Hello extends HttpServlet {

    String name=null;
    String address=null;
    //How to pass parameters inside the servlet ...it dont permit para ctr
    public Hello(){
        System.out.println("ctr of hello servlet");
    }

    //ServletConfig (small) vs ServletContext(big)
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        name=config.getInitParameter("name");
        address=config.getInitParameter("address");
        System.out.println("init is called..");
        //config -> config LN--> delhi

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        System.out.println("do get is called");
        PrintWriter pw=resp.getWriter();
        pw.print("hello to servlet "+ LocalDateTime.now()+"br>");
        pw.print(address+"<br>");
        pw.print(name+"<br>");
    }


    @Override
    public void destroy() {
        System.out.println("destroy is called...");
    }

}










