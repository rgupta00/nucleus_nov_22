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

public class Second extends HttpServlet {

    private Dog dog=null;
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("it is init of second servlet");
        dog=(Dog)getServletContext().getAttribute("dog");
    }


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        out.print("hello to all champs by sec servlet!:  " + LocalDateTime.now());
        out.print(dog.getDogName());
        getServletContext().removeAttribute("dog");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("it is destrooy of sec servlet");
    }

}
