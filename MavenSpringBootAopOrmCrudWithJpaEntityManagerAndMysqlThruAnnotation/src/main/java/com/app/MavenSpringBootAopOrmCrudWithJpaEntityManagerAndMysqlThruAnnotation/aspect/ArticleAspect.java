package com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.aspect;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class ArticleAspect {
	
	private long startTime;
	
	private long endTime;
	
	@Pointcut("execution(* com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO.*(..))")
	public void applyPointcutDate() {
	}
	
	@Before("applyPointcutDate()")
	public void showExecutionDate() {
		System.out.println("");
		System.out.println("Method Is Calling On :: "+ new Date());
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO.addArticle(..))")
	public void showStartTimeOfAddArticle(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO.addArticle(..))")
	public void showEndTimeOfAddArticle(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO.updateArticle(..))")
	public void showStartTimeOfUpdateArticle(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO.updateArticle(..))")
	public void showEndTimeOfUpdateArticle(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO.deleteArticle(..))")
	public void showStartTimeOfDeleteArticle(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO.deleteArticle(..))")
	public void showEndTimeOfDeleteArticle(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO.getArticleById(..))")
	public void showStartTimeOfGetArticleById(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO.getArticleById(..))")
	public void showEndTimeOfGetArticleById(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
	
	@Before("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO.getAllArticles(..))")
	public void showStartTimeOfGetAllArticles(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		int hashCode = jp.getSignature().hashCode();
		startTime = System.currentTimeMillis();
		System.out.println("Method Name Is :: "+methodName);
		System.out.println("Method Storing Memory Location Code Is :: "+hashCode);
		System.out.println("Method Start Time Is :: "+startTime);
	}
	
	@After("execution(public * com.app.MavenSpringBootAopOrmCrudWithJpaEntityManagerAndMysqlThruAnnotation.dao.IArticleDAO.getAllArticles(..))")
	public void showEndTimeOfGetAllArticles(JoinPoint jp) {
		endTime = System.currentTimeMillis();
		System.out.println("Method Declaring Type Is :: "+jp.getSignature().getDeclaringType());
		System.out.println("Method End Time Is :: "+endTime);
		System.out.println("Method Total Time Taken Is :: "+(endTime - startTime)+" MilliSeconds");
		System.out.println("");
	}
}
