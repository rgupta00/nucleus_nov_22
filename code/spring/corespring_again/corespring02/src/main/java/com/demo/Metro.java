package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// <bean id="v1" class="com.demo.Metro"/>
@Component(value = "v1")
//@Primary
public class Metro  implements Vehical{
    @Override
    public void move(){
        System.out.println("moving in a metro");
    }
}
