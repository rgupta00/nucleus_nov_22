package com.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class SessionDemo extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        PrintWriter out=response.getWriter();

        HttpSession httpSession=request.getSession();
        Integer counter=  (Integer) httpSession.getAttribute("counter");
        if(counter==null){
            out.print("welcome first time user");
            httpSession.setAttribute("counter", new Integer(1));
        }else {
            out.print("you have visited : "+ counter);
            httpSession.setAttribute("counter", ++counter);
        }

    }
}
