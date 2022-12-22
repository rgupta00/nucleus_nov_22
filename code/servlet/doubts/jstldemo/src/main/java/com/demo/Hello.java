package com.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Hello extends HttpServlet {

   public Hello(){
        System.out.println("ctr of servlet Hello");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        out.print("hello to all champs!:  " + LocalDateTime.now());
    }
}
