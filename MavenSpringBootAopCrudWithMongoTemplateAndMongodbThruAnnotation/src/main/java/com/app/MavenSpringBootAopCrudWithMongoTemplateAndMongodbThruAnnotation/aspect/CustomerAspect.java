package com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.aspect;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class CustomerAspect {
	
	private long startTime;
	
	private long endTime;
	
	@Pointcut("execution(* com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO.*(..))")
	public void applyPointcutDate() {
	}
	
	@Before("applyPointcutDate()")
	public void showExecutionDate() {
		System.out.println("");
		System.out.println("Method Is Calling On :: "+ new Date());
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO.saveCustomer(..))")
	public void showStartTimeOfSaveCustomer(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO.saveCustomer(..))")
	public void showEndTimeOfSaveCustomer(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO.updateCustomer(..))")
	public void showStartTimeOfUpdateCustomer(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO.updateCustomer(..))")
	public void showEndTimeOfUpdateCustomer(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO.deleteCustomer(..))")
	public void showStartTimeOfDeleteCustomer(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO.deleteCustomer(..))")
	public void showEndTimeOfDeleteCustomer(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO.getCustomerById(..))")
	public void showStartTimeOfGetCustomerById(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO.getCustomerById(..))")
	public void showEndTimeOfGetCustomerById(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO.getAllCustomers(..))")
	public void showStartTimeOfGetAllCustomers(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO.getAllCustomers(..))")
	public void showEndTimeOfGetAllCustomers(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
}
