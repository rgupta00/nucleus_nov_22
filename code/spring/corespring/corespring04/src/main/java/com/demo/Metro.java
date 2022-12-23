package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//<bean id="v2" class="com.demo.Metro" primary="true"/>
//@Primary
@Component(value = "v2")
public class Metro  implements Vehical{
    public void move(){
        System.out.println("moving in a metro");
    }
}
