package com.bankapp.service.aspect;

import com.bankapp.service.AccountServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect// advice +PC
public class LoggingAspect {

    private Logger logger= LogManager.getLogger(LoggingAspect.class);

    @Around("execution( * com.bankapp.service..*.*(.. ))")
    public Object applyLogging(ProceedingJoinPoint joinPoint)throws Throwable{
        long start=System.currentTimeMillis();

        Object value=joinPoint.proceed();
        logger.info("fund is transfred from acc to another");
        long  end=System.currentTimeMillis();
        logger.info("time taken to method is : "+joinPoint.getSignature().getName()+":"+ (end-start));
        return value;
    }

}
