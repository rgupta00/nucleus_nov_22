package com.bankapp.service.aspect;

import com.bankapp.service.accounts.AccountServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

//ASpect=Advice + pointcut
@Service
@Aspect
public class BankAppLoggingAspect {
    private Logger logger= LogManager.getLogger(AccountServiceImpl.class);

//    @Around(value = "execution( * com.bankapp.service..*.*(..))")
   @Around(value = "execution( * com.bankapp.service..*.*(..))")
    public Object aroundLogging(ProceedingJoinPoint point)throws Throwable{
       Object[] arguments= point.getArgs();

        long start=System.currentTimeMillis();

        Object retrunValue=  point.proceed();

        long end=System.currentTimeMillis();
        logger.info("time taken to execute "+point.getSignature().getName()+" method is :"+ (end-start)+ " ms");
        return  retrunValue;
    }



//
//    @Pointcut("execution(public void transfer(..))")
//    public void applyLogging(){}
//
//    @Around("applyLogging()")
//    public Object aroundLogging(){
//
//        return  null;
//    }
}

// System.out.println("----------------");
//         MethodSignature signature = (MethodSignature) point.getSignature();
//         Method method = signature.getMethod();
//
//         Parameter[] parameters = method.getParameters();
//         List<String> parameterNames = new ArrayList<>();
//
//        for (Parameter parameter : parameters) {
//        String parameterName = parameter.getName();
//        System.out.println(parameterName);
//        System.out.println( parameter.getType());
//        //how to get the a
//        parameterNames.add(parameterName);
//        }
//        System.out.println("-------------");
//        // parameterNames.forEach(p-> System.out.println(p));
//        System.out.println("-------------");