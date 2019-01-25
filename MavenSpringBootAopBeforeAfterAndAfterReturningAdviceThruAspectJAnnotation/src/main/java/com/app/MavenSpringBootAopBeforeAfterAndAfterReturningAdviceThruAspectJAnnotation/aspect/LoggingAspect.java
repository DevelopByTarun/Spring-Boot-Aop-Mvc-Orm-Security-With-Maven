package com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.aspect;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
	
	private long startTime;
	
	private long endTime;
	
	@Pointcut("execution(* com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.*(..))")
	public void applyPointcutDate() {
	}
	
	@Before("applyPointcutDate()")
	public void showExecutionDate() {
		System.out.println("Method Is Calling On :: "+ new Date());
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getEmployee(..))")
	public void calculateStartTimeOnFirst(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName+" And Start Time Is :: "+startTime);
		System.out.println("");
	}
		
	@After("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getEmployee(..))")
	public void calculateEndTimeOnFirst(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		endTime = System.currentTimeMillis();
		System.out.println("");
		System.out.println("Method Name Is :: "+methodName+" And End Time Is :: "+endTime);
		System.out.println("Total Time Taken Is :: "+(endTime - startTime)+" Ms");
		System.out.println("");
	}
	
	@AfterReturning("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getEmployee(..))")
	public void returnValueOnFirst(JoinPoint jp) {
		System.out.println("Method Signature Is :: "+jp.getSignature());
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getEmployeeAddress(..))")
	public void calculateStartTimeOnSecond(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName+" And Start Time Is :: "+startTime);
		System.out.println("");
	}
	
	@After("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getEmployeeAddress(..))")
	public void calculateEndTimeOnSecond(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		endTime = System.currentTimeMillis();
		System.out.println("");
		System.out.println("Method Name Is :: "+methodName+" And End Time Is :: "+endTime);
		System.out.println("Total Time Taken Is :: "+(endTime - startTime)+" Ms");
		System.out.println("");
	}
	
	@AfterReturning(pointcut = "execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getEmployeeAddress(..))", returning = "returnValue")
	public void returnValueOnSecond(JoinPoint jp, Object returnValue) {
		System.out.println("Method Signature Is :: "+jp.getSignature());
		System.out.println("Method Return Value Is :: "+returnValue.toString());
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getEmployeeWithAddress(..))")
	public void calculateStartTimeOnThird(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName+" And Start Time Is :: "+startTime);
		System.out.println("");
	}
	
	@After("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getEmployeeWithAddress(..))")
	public void calculateEndTimeOnThird(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		endTime = System.currentTimeMillis();
		System.out.println("");
		System.out.println("Method Name Is :: "+methodName+" And End Time Is :: "+endTime);
		System.out.println("Total Time Taken Is :: "+(endTime - startTime)+" Ms");
		System.out.println("");
	}
	
	@AfterReturning(pointcut = "execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getEmployeeWithAddress(..))", returning = "returnValue")
	public void returnValueOnThird(JoinPoint jp, Object returnValue) {
		System.out.println("Method Signature Is :: "+jp.getSignature());
		System.out.println("Method Return Value Is :: "+returnValue);
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getEmployeeAnnualSalaryPackage(..))")
	public void calculateStartTimeOnFourth(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName+" And Start Time Is :: "+startTime);
		System.out.println("");
	}
	
	@After("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getEmployeeAnnualSalaryPackage(..))")
	public void calculateEndTimeOnFourth(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		endTime = System.currentTimeMillis();
		System.out.println("");
		System.out.println("Method Name Is :: "+methodName+" And End Time Is :: "+endTime);
		System.out.println("Total Time Taken Is :: "+(endTime - startTime)+" Ms");
		System.out.println("");
	}
	
	@AfterReturning(pointcut = "execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getEmployeeAnnualSalaryPackage(..))", returning = "returnValue")
	public void returnValueOnFourth(JoinPoint jp, Object returnValue) {
		System.out.println("Method Signature Is :: "+jp.getSignature());
		System.out.println("Method Return Value Is :: "+returnValue);
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getStudent(..))")
	public void calculateStartTimeOnFifth(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName+" And Start Time Is :: "+startTime);
		System.out.println("");
	}
	
	@After("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getStudent(..))")
	public void calculateEndTimeOnFifth(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		endTime = System.currentTimeMillis();
		System.out.println("");
		System.out.println("Method Name Is :: "+methodName+" And End Time Is :: "+endTime);
		System.out.println("Total Time Taken Is :: "+(endTime - startTime)+" Ms");
		System.out.println("");
	}
	
	@AfterReturning("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getStudent(..))")
	public void returnValueOnFifth(JoinPoint jp) {
		System.out.println("Method Signature Is :: "+jp.getSignature());
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getStudentAddress(..))")
	public void calculateStartTimeOnSixth(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName+" And Start Time Is :: "+startTime);
		System.out.println("");
	}
	
	@After("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getStudentAddress(..))")
	public void calculateEndTimeOnSixth(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		endTime = System.currentTimeMillis();
		System.out.println("");
		System.out.println("Method Name Is :: "+methodName+" And End Time Is :: "+endTime);
		System.out.println("Total Time Taken Is :: "+(endTime - startTime)+" Ms");
		System.out.println("");
	}
	
	@AfterReturning(pointcut = "execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getStudentAddress(..))", returning = "returnValue")
	public void returnValueOnSixth(JoinPoint jp, Object returnValue) {
		System.out.println("Method Signature Is :: "+jp.getSignature());
		System.out.println("Method Return Value Is :: "+returnValue.toString());
		System.out.println("");
	}
		
	@Before("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getStudentWithAddress(..))")
	public void calculateStartTimeOnSeventh(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName+" And Start Time Is :: "+startTime);
		System.out.println("");
	}
	
	@After("execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getStudentWithAddress(..))")
	public void calculateEndTimeOnSeventh(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		endTime = System.currentTimeMillis();
		System.out.println("");
		System.out.println("Method Name Is :: "+methodName+" And End Time Is :: "+endTime);
		System.out.println("Total Time Taken Is :: "+(endTime - startTime)+" Ms");
		System.out.println("");
	}
	
	@AfterReturning(pointcut = "execution(public * com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service.IService.getStudentWithAddress(..))", returning = "returnValue")
	public void returnValueOnSeventh(JoinPoint jp, Object returnValue) {
		System.out.println("Method Signature Is :: "+jp.getSignature());
		System.out.println("Method Return Value Is :: "+returnValue);
		System.out.println("");
	}
}
