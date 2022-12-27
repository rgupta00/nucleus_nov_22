package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //rather then i am doing DI  myself i want i should be done by an exteranl conerainerr
        // ie spring container

        //Ask spring to provide  the bean BeanFactory vs ApplicationContext
        ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");

        Passanger passanger=(Passanger) ctx.getBean("p");
        passanger.travel();

//        System.out.println(passanger.hashCode());
//        System.out.println(passanger.getVehical().hashCode());
//        passanger.travel();
//        //Bean are singleton by default
//
//        Passanger passanger2=(Passanger) ctx.getBean("p");
//        System.out.println(passanger2.hashCode());
//        System.out.println(passanger2.getVehical().hashCode());

//        Vehical vehical=new Metro();
//       Passanger passanger=new Passanger();
//       passanger.setName("raj");
//       passanger.setVehical(vehical);
//       passanger.travel();
    }
}