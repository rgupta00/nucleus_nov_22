package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //AbstractApplicationContext  vs ApplicationContext
        //diff: if u want to register registerShutdownHook
        AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
        ctx.registerShutdownHook();

        Foo foo=(Foo) ctx.getBean("foobean");
        foo.doWork();

        Bar bar= (Bar) ctx.getBean("barbean");
        bar.doWork();



    }
}
