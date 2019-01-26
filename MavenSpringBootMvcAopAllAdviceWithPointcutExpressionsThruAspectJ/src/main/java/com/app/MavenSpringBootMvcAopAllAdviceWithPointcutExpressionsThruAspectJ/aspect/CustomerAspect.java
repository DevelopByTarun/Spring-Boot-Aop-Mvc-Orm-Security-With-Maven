package com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CustomerAspect {
	
	@Before("execution(* com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ.service.CustomerService.getCustomerById(..))")
	public void getCustomerByIdAdvice() {
		System.out.println("Execute advice on getCustomerByIdAdvice()");
	}

	@Before("execution(* com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ.service.CustomerService.set*(..))")
	public void getAllSetAdvices(JoinPoint joinPoint) {
		System.out.println("Excute advice on Service set Method: " + joinPoint.getSignature().getName());
	}
}
