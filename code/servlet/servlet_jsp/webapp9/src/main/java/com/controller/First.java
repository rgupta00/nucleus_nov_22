package com.controller;

import com.pojo.Dog;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class First extends HttpServlet {

    private Dog dog=null;
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("it is init of first servlet");
        dog=(Dog)getServletContext().getAttribute("dog");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        out.print("hello to all champs by first servlet!:  " + LocalDateTime.now());
        out.print(dog.getDogName());
      synchronized (this){
          dog.setDogName("foo dog");
          getServletContext().setAttribute("dog", dog);//replace
      }
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("it is destrooy of first servlet");
    }
}
