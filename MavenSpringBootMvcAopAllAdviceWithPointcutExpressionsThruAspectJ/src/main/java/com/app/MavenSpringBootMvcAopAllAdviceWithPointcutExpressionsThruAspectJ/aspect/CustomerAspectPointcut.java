package com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CustomerAspectPointcut {

	@Before("findCustomerByLastNamePointCut()")
	public void loggingAdvice() {
		System.out.println("Execute logAdvice on findCustomerByLastName()");
	}

	@Pointcut("execution(* com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ.service.CustomerAnotherService.findCustomerByLastName(..))")
	public void findCustomerByLastNamePointCut() {
	}

	@Before("allMethodsPointcut()")
	public void allServiceMethodsAdvice(JoinPoint joinPoint) {
		System.out.println("Execute logAdvice for AnotherService Method with joinPoint: " + joinPoint.getSignature().getName());
	}

	@Pointcut("within(com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ.service.CustomerAnotherService)")
	public void allMethodsPointcut() {
	}
}
