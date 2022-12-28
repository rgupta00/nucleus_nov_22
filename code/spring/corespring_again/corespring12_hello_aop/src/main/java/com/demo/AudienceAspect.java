package com.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AudienceAspect {
    @After("execution(public void doMagic())")
    public void clapping(){
        System.out.println("clapping ... maza aa gaya");
    }
}
