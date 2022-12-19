package com.listners;

import com.pojo.Dog;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DogInitLister implements ServletContextListener {
    private Dog dog=null;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("it is called first of all contextInitialized()");
        String dogName= sce.getServletContext().getInitParameter("dogName");
        dog=new Dog();
        dog.setDogName(dogName);

        sce.getServletContext().setAttribute("dog", dog);

    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("it is called at last of all contextDestroyed()");
        if(sce.getServletContext().getAttribute("dog")!=null) {
            sce.getServletContext().removeAttribute("dog");
        }
        dog=null;
    }
}
