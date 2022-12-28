package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class Main {
    public static void main(String[] args) {

        //PropertySourcesPlaceholderConfigurer
       //how u use it       ApplicationContext vs
        AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
        //we have to regiseter shut down hook
        ctx.registerShutdownHook();
        Account account=ctx.getBean("acc",Account.class);
        System.out.println(account);
//        Foo foo=ctx.getBean("foo", Foo.class);
//
//        foo.doWork();
//        foo.doWork();
//
//        ctx.close();
    }
}
