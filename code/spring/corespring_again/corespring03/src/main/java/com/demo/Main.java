package com.demo;

import com.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //ClassPathXmlApplicationContext
       // FileSystemXmlApplicationContext
        //AnnotationConfigApplicationContext
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        Passanger passanger=(Passanger) ctx.getBean("p");
        passanger.travel();

    }
}