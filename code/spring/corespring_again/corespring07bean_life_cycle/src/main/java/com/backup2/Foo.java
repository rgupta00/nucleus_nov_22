package com.backup2;

import org.springframework.beans.factory.BeanNameAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Foo implements BeanNameAware {
    private String name;

    public Foo(){
        System.out.println("i am ctr");
    }

    @PostConstruct
    public void foo(){
        System.out.println("it is init method annotation wala");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("i am setName");
        this.name = name;
    }
    public void doWork(){
        System.out.println("doing work..."+ name);
    }

    @PreDestroy
    public void bar(){
        System.out.println("it is destroy method annotation wala");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean whose name : "+ name+" is created in the container");
    }
}
