package com.demo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloController extends HttpServlet {

    private String name;
    private String email;
    //tomcat always call defauolt ctr and can not call para
    public HelloController(){
        System.out.println("para ctr of HelloController");
    }

    //ServletConfig vs ServletContext
    //init method provide ServletConfig to a servlet
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("init method of servlet HelloController");
        name=config.getInitParameter("name");
        //LN-->Dehli
        email=config.getServletContext().getInitParameter("emailid");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget method of servlet HelloController "+ name);
        System.out.println("email "+ email);
    }


    @Override
    public void destroy() {
        System.out.println("destory method of servlet HelloController");
    }


}
