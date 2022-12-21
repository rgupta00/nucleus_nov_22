package com.calapp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class By extends HttpServlet {


    private String emailid=null;

    public By(){
        System.out.println("ctr of by servlet");
    }

    //ServletConfig (small) vs ServletContext(big)
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        emailid=config.getServletContext().getInitParameter("emailid");

        //config -> config LN--> delhi

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        System.out.println("do get of by servlet is called called");
        PrintWriter pw=resp.getWriter();
        pw.print("hello to by servlet "+ LocalDateTime.now()+"<br>");
        pw.print(emailid+"<br>");

    }


    @Override
    public void destroy() {
        System.out.println("destroy is  called for by servlet...");
    }

}
