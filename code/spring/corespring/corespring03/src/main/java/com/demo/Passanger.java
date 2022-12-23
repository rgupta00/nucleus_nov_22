package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 <bean id="p" class="com.demo.Passanger" autowire="byType">
       <property name="name" value="raj"/>
   </bean>
 */
@Component(value = "p")
public class Passanger {

    @Value("raj")
    private String name;

    @Autowired
    private Vehical vehical;

    public void setName(String name) {
        this.name = name;
    }
    public void setVehical(Vehical vehical) {
        this.vehical = vehical;
    }
    public void travel(){
        System.out.println("name of passanger : "+ name);
        vehical.move();
    }
}
