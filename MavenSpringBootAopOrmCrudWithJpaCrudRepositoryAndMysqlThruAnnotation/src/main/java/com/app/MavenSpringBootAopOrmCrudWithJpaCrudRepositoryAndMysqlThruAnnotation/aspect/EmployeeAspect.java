package com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.aspect;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class EmployeeAspect {
	
	private long startTime;
	
	private long endTime;
	
	@Pointcut("execution(* com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO.*(..))")
	public void applyPointcutDate() {
	}
	
	@Before("applyPointcutDate()")
	public void showExecutionDate() {
		System.out.println("");
		System.out.println("Method Is Calling On :: "+ new Date());
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO.saveEmployee(..))")
	public void showStartTimeOfSaveEmployee(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO.saveEmployee(..))")
	public void showEndTimeOfSaveEmployee(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO.updateEmployee(..))")
	public void showStartTimeOfUpdateEmployee(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO.updateEmployee(..))")
	public void showEndTimeOfUpdateEmployee(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO.deleteEmployee(..))")
	public void showStartTimeOfDeleteEmployee(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO.deleteEmployee(..))")
	public void showEndTimeOfDeleteEmployee(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO.getEmployeeById(..))")
	public void showStartTimeOfGetEmployeeById(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO.getEmployeeById(..))")
	public void showEndTimeOfGetEmployeeById(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO.getAllEmployees(..))")
	public void showStartTimeOfGetAllEmployees(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO.getAllEmployees(..))")
	public void showEndTimeOfGetAllEmployees(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
}
