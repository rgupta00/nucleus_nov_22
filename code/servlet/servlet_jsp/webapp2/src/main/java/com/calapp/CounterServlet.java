package com.calapp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterServlet extends HttpServlet {

    private AtomicInteger counter=new AtomicInteger(0);

    public CounterServlet() {}

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        try{
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.ser"));
            counter=(AtomicInteger)ois.readObject();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        //passimisitic vs optimic lock          CAS
        PrintWriter out=resp.getWriter();
        out.print("visited: "+ counter.incrementAndGet()+"<br>");

    }

    @Override
    public void destroy() {
        try{
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("data.ser"));
            oos.writeObject(counter);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
