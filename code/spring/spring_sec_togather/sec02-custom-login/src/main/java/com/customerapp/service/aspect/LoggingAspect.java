package com.customerapp.service.aspect;

import com.customerapp.service.CustomerServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    // modeifer retrun_type packkage/class method(..) throws Aexx
    private static Logger logger=LogManager.getLogger(CustomerServiceImpl.class);

    //MyLoggingAnnotation

    @Around("@annotation(MyLoggingAnnotation)")
    public Object loggingAround(ProceedingJoinPoint point)throws Throwable{
        long start=System.currentTimeMillis();
        Object object=point.proceed();
        long end=System.currentTimeMillis();
        logger.info("time taken to ex : "+ (end-start)+" ms"+" called for "+ point.getSignature().getName());
        return  object;

    }

//    @Around("execution( * com.customer.service.*.*(..) )")
//    public Object loggingAround(ProceedingJoinPoint point)throws Throwable{
//        long start=System.currentTimeMillis();
//        Object object=point.proceed();
//        long end=System.currentTimeMillis();
//        logger.info("time taken to ex : "+ (end-start)+" ms");
//        return  object;
//
//    }
}
