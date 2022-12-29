package com.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
//Aspet=advice +Pointcut

@Component
@Aspect
public class Audience {

    //Around advice: servlet filter , spring sec

    @Around("execution(public String doMagic())")
    public Object applyAroundAvice(ProceedingJoinPoint pjp)throws Throwable{
        System.out.println("before-----");
       Object val= pjp.proceed();
        System.out.println("------------");
        System.out.println(pjp.getTarget().getClass());
        System.out.println(pjp.getSignature().getName());
        System.out.println("------------");
        System.out.println("after-----");
        return val;
    }
//
//  @AfterThrowing(pointcut = "execution(public void doMagic())" ,throwing = "ex")
//    public void clapping(MagicianFallSick ex){
//        System.out.println("call the dr :"+ex.getMessage());
//    }



    //@Pointcut("execution(  * com.demo..*.*())")
//    @Pointcut("execution(  * com.demo..*.*(..))")
//    public void doMethod(){}
//
//    @After("doMethod()")
//    public void clapping(){
//        System.out.println("clapping ... maza aa gaya!");
//    }
}












