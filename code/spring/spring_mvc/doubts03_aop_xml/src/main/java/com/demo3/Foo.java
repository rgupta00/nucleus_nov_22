package com.demo3;

import org.springframework.stereotype.Component;

public class Foo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println("value: "+ name);
    }
}
