package com.demo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Hello extends HttpServlet {

    private String data=null;
    private String emailId;
   public Hello(){
        System.out.println("ctr of servlet Hello");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("init is called");
//        data=config.getInitParameter("mydata");
//        data=this.getInitParameter("mydata");
        data=getInitParameter("mydata");
//        emailId=this.getServletConfig().getServletContext().getInitParameter("emailid");
        emailId=getServletContext().getInitParameter("emailid");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        out.print("hello to all champs!:  " + LocalDateTime.now());
        System.out.println("doget is called :"+ data);
        System.out.println(emailId);
    }

    @Override
    public void destroy() {
        System.out.println("destroy is called");
    }

}
