package com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.aspect;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class DatabaseAspect {
	
	private long startTime;
	
	private long endTime;
	
	@Pointcut("execution(* com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO.*(..))")
	public void applyPointcutDate() {
	}
	
	@Before("applyPointcutDate()")
	public void showExecutionDate() {
		System.out.println("");
		System.out.println("Method Is Calling On :: "+ new Date());
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO.saveStudent(..))")
	public void showStartTimeOfSaveStudent(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO.saveStudent(..))")
	public void showEndTimeOfSaveStudent(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO.updateStudent(..))")
	public void showStartTimeOfUpdateStudent(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO.updateStudent(..))")
	public void showEndTimeOfUpdateStudent(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO.deleteStudent(..))")
	public void showStartTimeOfDeleteStudent(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO.deleteStudent(..))")
	public void showEndTimeOfDeleteStudent(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO.getStudentById(..))")
	public void showStartTimeOfGetStudentById(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO.getStudentById(..))")
	public void showEndTimeOfGetStudentById(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO.getAllStudents(..))")
	public void showStartTimeOfGetAllStudents(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO.getAllStudents(..))")
	public void showEndTimeOfGetAllStudents(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
}
