package com.app.MavenSpringBootAopBeforeAfterAdviceWithPointcutThruAspectJAnnotation.aspect;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
	
	private long startTime;
	
	private long endTime;
	
	@Pointcut("execution(* com.app.MavenSpringBootAopBeforeAfterAdviceWithPointcutThruAspectJAnnotation.service.IService.*(..))")
	public void applyPointcutDate() {
	}
	
	@Before("applyPointcutDate()")
	public void showExecutionDate() {
		System.out.println("Method Is Calling On :: "+ new Date());
		System.out.println("");
	}
	
	@Pointcut("execution(public * com.app.MavenSpringBootAopBeforeAfterAdviceWithPointcutThruAspectJAnnotation.service.IService.*(..))")
	public void applyPointcutTime() {
	}
	
	@Before("applyPointcutTime()")
	public void calculateStartTime(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName+" And Start Time Is :: "+startTime);
		System.out.println("");
	}
	
	@After("applyPointcutTime()")
	public void calculateEndTime(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		endTime = System.currentTimeMillis();
		System.out.println("");
		System.out.println("Method Name Is :: "+methodName+" And End Time Is :: "+endTime);
		System.out.println("Total Time Taken Is :: "+(endTime - startTime)+" Ms");
		System.out.println("");
	}
}
