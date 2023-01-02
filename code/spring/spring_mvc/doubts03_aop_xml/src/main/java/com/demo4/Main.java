package com.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        Foo foo=ctx.getBean("foo", Foo.class);
        foo.printFooState();
        Foo foo2=ctx.getBean("foo", Foo.class);
       foo2.printFooState();


    }
}
