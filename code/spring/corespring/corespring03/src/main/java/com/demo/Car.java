package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//<bean id="v1" class="com.demo.Car"/>
@Component(value ="v1" )
@Primary
public class Car implements Vehical{
    public void move(){
        System.out.println("moving in a car");
    }
}
