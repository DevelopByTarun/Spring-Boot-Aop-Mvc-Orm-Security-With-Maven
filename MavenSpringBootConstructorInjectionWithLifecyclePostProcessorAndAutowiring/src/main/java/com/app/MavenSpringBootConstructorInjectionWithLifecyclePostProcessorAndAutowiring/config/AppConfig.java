package com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.bean.AddressBean;
import com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.bean.EmployeeBean;
import com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.bean.StudentBean;
import com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.postprocessor.AddressBeanPostProcessor;
import com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.postprocessor.EmployeeBeanPostProcessor;
import com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.postprocessor.StudentBeanPostProcessor;
import com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.service.IService;
import com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.service.ServiceImple;

@Configuration
@ComponentScan(basePackages = "com.app")
@PropertySource("classpath:application.properties")
public class AppConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	@Scope("singleton")
	AddressBeanPostProcessor getAddressBeanPostProcessor() {
		return new AddressBeanPostProcessor();
	}
	
	@Bean
	@Scope("singleton")
	EmployeeBeanPostProcessor getEmployeeBeanPostProcessor() {
		return new EmployeeBeanPostProcessor();
	}
	
	@Bean(name = "employee")
	@Scope("singleton")
	AddressBean getEmployeeAddress() {
		AddressBean employeeAddress = new AddressBean(environment.getProperty("employee.employeeAddress.state"), environment.getProperty("employee.employeeAddress.country"));
		return employeeAddress;
	}
	
	@Bean
	@Scope("singleton")
	@Lazy
	EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean(environment.getProperty("employee.eUserid"), environment.getProperty("employee.ePassword"), environment.getProperty("employee.eName"), getEmployeeAddress());
		return employeeBean;
	}
	
	@Bean
	@Scope("singleton")
	StudentBeanPostProcessor getStudentBeanPostProcessor() {
		return new StudentBeanPostProcessor();
	}
	
	@Bean(name = "student")
	@Scope("singleton")
	AddressBean getStudentAddress() {
		AddressBean studentAddress = new AddressBean(environment.getProperty("student.studentAddress.state"), environment.getProperty("student.studentAddress.country"));
		return studentAddress;
	}
	
	@Bean
	@Scope("singleton")
	@Lazy
	StudentBean getStudentBean() {
		StudentBean studentBean = new StudentBean(environment.getProperty("student.sUserid"), environment.getProperty("student.sPassword"), environment.getProperty("student.sName"), getStudentAddress());
		return studentBean;
	}
	
	@Bean(name = "myService")
	@Scope("singleton")
	IService getIService() {
		return new ServiceImple();
	}
}
