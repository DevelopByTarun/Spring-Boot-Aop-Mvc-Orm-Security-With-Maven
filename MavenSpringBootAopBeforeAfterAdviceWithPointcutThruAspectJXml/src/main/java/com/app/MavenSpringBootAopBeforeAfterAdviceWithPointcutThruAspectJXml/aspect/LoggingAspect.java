package com.app.MavenSpringBootAopBeforeAfterAdviceWithPointcutThruAspectJXml.aspect;

import java.util.Date;
import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
	
	private long startTime;
	
	private long endTime;
	
	public void showExecutionDate() {
		System.out.println("Method Is Calling On :: "+ new Date());
		System.out.println("");
	}
	
	public void calculateStartTime(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName+" And Start Time Is :: "+startTime);
		System.out.println("");
	}
	
	public void calculateEndTime(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		endTime = System.currentTimeMillis();
		System.out.println("");
		System.out.println("Method Name Is :: "+methodName+" And End Time Is :: "+endTime);
		System.out.println("Total Time Taken Is :: "+(endTime - startTime)+" Ms");
		System.out.println("");
	}
}
