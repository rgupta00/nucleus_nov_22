package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainWithSpring {
    public static void main(String[] args) {
        //Pull vs push
        //rather then passanger is looking for vehical , vehical should be pushed to the passanger
        //HLM                       LLM
        //Passanger ---------------- Vehical: Car , Metro
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("demo.xml");
        Passanger passanger=(Passanger) applicationContext.getBean("p");
        passanger.travel();

    }
}