package com.listners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class DogAttibuteListner implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("dog attribute is added...");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("dog attribute is reov...");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("dog attribute is replaced...");
    }
}
