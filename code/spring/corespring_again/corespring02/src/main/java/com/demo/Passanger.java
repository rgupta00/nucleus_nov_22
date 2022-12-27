package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//DIP vs DI
/*
     >

        </bean>
 */
@Component(value = "p") //<bean id="p" class="com.demo.Passanger"
@Scope("prototype")
public class Passanger {

    @Value("raj")           //  <property name="name" value="raj"/>

    private String name;

    @Autowired          //autowire="byType"         Why field injetion is bad programming practice?
    private Vehical Vehical;

    public Passanger(){
        System.out.println("it is the ctr of passanger");
    }

    public String getName() {
        return name;
    }

    public Vehical getVehical() {
        return Vehical;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehical(Vehical vehical) {
        Vehical = vehical;
    }

    public void travel(){
        System.out.println("name of passanger : "+ name);
        Vehical.move();
    }
}
