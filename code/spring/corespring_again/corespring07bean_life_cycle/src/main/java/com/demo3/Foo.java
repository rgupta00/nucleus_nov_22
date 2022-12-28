package com.demo3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Foo {
    private String name;

    public Foo(){
        System.out.println("it is a def ctr");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void doWork(){

        System.out.println("doing work..foo wala."+ name);
    }


}
