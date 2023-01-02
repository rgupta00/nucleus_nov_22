package com.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("demo3.xml");
        Foo foo=ctx.getBean("foo",Foo.class);
        foo.print();

        foo.setName("new value");

        Foo foo2=ctx.getBean("foo",Foo.class);
        System.out.println(foo.getName());
        System.out.println(foo2.getName());
/*
        ApplicationContext ctx2=new ClassPathXmlApplicationContext("demo3.xml");
        Foo foo3=ctx2.getBean("foo",Foo.class);
        System.out.println(foo3.hashCode());*/

    }
}
