package com.demo3;

import com.demo.Bar;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        //AbstractApplicationContext  vs ApplicationContext
        //diff: if u want to register registerShutdownHook
        //ClassPathXmlApplicationContext vs FileSystemXmlApplicationContext
       // ApplicationContext ctx=new ClassPathXmlApplicationContext("demo3.xml");

        BeanFactory ctx=new XmlBeanFactory(new ClassPathResource("demo3.xml"));
//        Foo foo=ctx.getBean("foo",Foo.class);
//        foo.doWork();

    }
}
