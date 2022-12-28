package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        VehicalFactory vehicalFactory=new VehicalFactory();
        Vehical vehical=vehicalFactory.getVehical("bike");
        vehical.move();
    }
}