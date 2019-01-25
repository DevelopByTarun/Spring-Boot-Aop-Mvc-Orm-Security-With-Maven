package com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.bean.EmployeeBean;

public class EmployeeBeanPostProcessor implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof EmployeeBean) {       
			System.out.println("Post Process Before Initialization Method Of "+beanName+" Is Called");
			System.out.println("");
		}
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof EmployeeBean) {
			System.out.println("Post Process After Initialization Method Of "+beanName+" Is Called");
			System.out.println("");
		}
		return bean;
	}
}
