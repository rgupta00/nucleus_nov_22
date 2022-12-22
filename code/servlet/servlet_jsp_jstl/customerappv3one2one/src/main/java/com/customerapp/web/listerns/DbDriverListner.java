package com.customerapp.web.listerns;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DbDriverListner implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String driver=sce.getServletContext().getInitParameter("driverName");
        try{
            Class.forName(driver);
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        System.out.println("--------driver is loaded----------");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
