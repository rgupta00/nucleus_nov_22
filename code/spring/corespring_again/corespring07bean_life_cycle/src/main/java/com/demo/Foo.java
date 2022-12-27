package com.demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Foo {
    private String name;

    public Foo(){
        System.out.println("i am ctr foo wala");
    }

    @PostConstruct
    public void foo(){
        System.out.println("it is init method annotation foo wala");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("i am setName foo wala");
        this.name = name;
    }
    public void doWork(){
        System.out.println("doing work..foo wala."+ name);
    }

    @PreDestroy
    public void bar(){
        System.out.println("it is destroy method annotation foo wala");
    }

}
