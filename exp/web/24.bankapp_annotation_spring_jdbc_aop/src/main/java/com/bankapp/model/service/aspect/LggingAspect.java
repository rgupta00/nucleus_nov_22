package com.bankapp.model.service.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bankapp.model.service.AccountServiceImpl;

@Service
@Aspect
public class LggingAspect {
	private Logger logger=LoggerFactory.getLogger(LggingAspect.class);
	
	@Around("@annotation(MyAppLogging)")
	public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();
			
		Object returnValue=joinPoint.proceed();

		long end = System.currentTimeMillis();
		
		logger.info("time taken to execute  " +joinPoint.getSignature().getName() + ": "+(end-start));
		return returnValue;
	}
}





