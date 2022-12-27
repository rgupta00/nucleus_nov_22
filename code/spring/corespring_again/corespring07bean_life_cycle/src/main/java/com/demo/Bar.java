package com.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bar {
    private String name;

    public Bar(){
        System.out.println("i am ctr of bar");
    }

    @PostConstruct
    public void foo(){
        System.out.println("it is init method annotation wala of bar");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("i am setName of bar");
        this.name = name;
    }
    public void doWork(){
        System.out.println("doing work of bar..."+ name);
    }

    @PreDestroy
    public void bar(){
        System.out.println("it is destroy method annotation wala of bar");
    }

}
