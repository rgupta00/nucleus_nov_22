package com.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);

        Foo foo=ctx.getBean("foo", Foo.class);
        System.out.println(foo.hashCode());
        System.out.println(foo.getBar().hashCode());
       // foo.printFooState();

        Foo foo2=ctx.getBean("foo", Foo.class);
        System.out.println(foo2.hashCode());
        System.out.println(foo2.getBar().hashCode());

        //foo2.printFooState();


    }
}
