package com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml.aspect;

import java.util.concurrent.TimeUnit;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	
	public void totalTimeTakenForThis(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.nanoTime();
		pjp.proceed();
		long end = System.nanoTime();
		String methodName = pjp.getSignature().getName();
		System.out.println("Execution Of "+methodName+" Took "+TimeUnit.NANOSECONDS.toMillis(end - start)+" Ms");
		System.out.println("");
	}
			
	public void aroundGetEmployee(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Method Signature Before Execution :: "+pjp.getSignature());
		System.out.println("");
		System.out.println("Method Declaring Type Before Execution :: "+pjp.getSignature().getDeclaringType());
		System.out.println("");
		pjp.proceed();
		System.out.println("");
		System.out.println("Method Name After Execution :: "+pjp.getSignature().getName());
		System.out.println("");
		System.out.println("Method Declaring Type Name After Execution :: "+pjp.getSignature().getDeclaringTypeName());
		System.out.println("");
	}
	
	public void aroundGetEmployeAddress(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Method Signature Before Execution :: "+pjp.getSignature());
		System.out.println("");
		System.out.println("Method Declaring Type Before Execution :: "+pjp.getSignature().getDeclaringType());
		System.out.println("");
		pjp.proceed();
		System.out.println("");
		System.out.println("Method Name After Execution :: "+pjp.getSignature().getName());
		System.out.println("");
		System.out.println("Method Declaring Type Name After Execution :: "+pjp.getSignature().getDeclaringTypeName());
		System.out.println("");
	}
	
	public void aroundGetEmployeeWithAddress(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Method Signature Before Execution :: "+pjp.getSignature());
		System.out.println("");
		System.out.println("Method Declaring Type Before Execution :: "+pjp.getSignature().getDeclaringType());
		System.out.println("");
		pjp.proceed();
		System.out.println("");
		System.out.println("Method Name After Execution :: "+pjp.getSignature().getName());
		System.out.println("");
		System.out.println("Method Declaring Type Name After Execution :: "+pjp.getSignature().getDeclaringTypeName());
		System.out.println("");
	}
	
	public void aroundGetStudent(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Method Signature Before Execution :: "+pjp.getSignature());
		System.out.println("");
		System.out.println("Method Declaring Type Before Execution :: "+pjp.getSignature().getDeclaringType());
		System.out.println("");
		pjp.proceed();
		System.out.println("");
		System.out.println("Method Name After Execution :: "+pjp.getSignature().getName());
		System.out.println("");
		System.out.println("Method Declaring Type Name After Execution :: "+pjp.getSignature().getDeclaringTypeName());
		System.out.println("");
	}
	
	public void aroundGetStudentAddress(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Method Signature Before Execution :: "+pjp.getSignature());
		System.out.println("");
		System.out.println("Method Declaring Type Before Execution :: "+pjp.getSignature().getDeclaringType());
		System.out.println("");
		pjp.proceed();
		System.out.println("");
		System.out.println("Method Name After Execution :: "+pjp.getSignature().getName());
		System.out.println("");
		System.out.println("Method Declaring Type Name After Execution :: "+pjp.getSignature().getDeclaringTypeName());
		System.out.println("");
	}
	
	public void aroundGetStudentWithAddress(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Method Signature Before Execution :: "+pjp.getSignature());
		System.out.println("");
		System.out.println("Method Declaring Type Before Execution :: "+pjp.getSignature().getDeclaringType());
		System.out.println("");
		pjp.proceed();
		System.out.println("");
		System.out.println("Method Name After Execution :: "+pjp.getSignature().getName());
		System.out.println("");
		System.out.println("Method Declaring Type Name After Execution :: "+pjp.getSignature().getDeclaringTypeName());
		System.out.println("");
	}
}
