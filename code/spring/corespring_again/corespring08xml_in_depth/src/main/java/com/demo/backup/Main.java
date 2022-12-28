package com.demo.backup;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

       //how u use it       ApplicationContext vs
        AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
        //we have to regiseter shut down hook
        ctx.registerShutdownHook();
        Foo foo=ctx.getBean("foo", Foo.class);

        foo.doWork();
        foo.doWork();

        ctx.close();
    }
}
