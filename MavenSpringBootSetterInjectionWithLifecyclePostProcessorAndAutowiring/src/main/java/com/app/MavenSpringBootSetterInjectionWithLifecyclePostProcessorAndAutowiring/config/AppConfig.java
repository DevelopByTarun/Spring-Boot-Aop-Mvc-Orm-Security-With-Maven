package com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.bean.AddressBean;
import com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.bean.EmployeeBean;
import com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.bean.StudentBean;
import com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.postprocessor.EmployeeBeanPostProcessor;
import com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.postprocessor.StudentBeanPostProcessor;
import com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.service.IService;
import com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.service.ServiceImple;

@Configuration
@ComponentScan(basePackages = "com.app")
@PropertySource("classpath:application.properties")
public class AppConfig {
	
	@Autowired
	Environment environment;
	
	@Bean
	@Scope("singleton")
	EmployeeBeanPostProcessor getEmployeeBeanPostProcessor() {
		return new EmployeeBeanPostProcessor();
	}
	
	@Bean(name = "employee")
	@Scope("singleton")
	AddressBean getEmployeeAddress() {
		AddressBean employeeAddress = new AddressBean();
		employeeAddress.setState(environment.getProperty("employee.employeeAddress.state"));
		employeeAddress.setCountry(environment.getProperty("employee.employeeAddress.country"));
		return employeeAddress;
	}
	
	@Bean
	@Lazy
	@Scope("singleton")
	EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.seteUserid(environment.getProperty("employee.eUserid"));
		employeeBean.setePassword(environment.getProperty("employee.ePassword"));
		employeeBean.seteName(environment.getProperty("employee.eName"));
		employeeBean.setEmployeeAddress(getEmployeeAddress());
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
		AddressBean studentAddress = new AddressBean();
		studentAddress.setState(environment.getProperty("student.studentAddress.state"));
		studentAddress.setCountry(environment.getProperty("student.studentAddress.country"));
		return studentAddress;
	}
	
	@Bean
	@Lazy
	@Scope("singleton")
	StudentBean getStudentBean() {
		StudentBean studentBean = new StudentBean();
		studentBean.setsUserid(environment.getProperty("student.sUserid"));
		studentBean.setsPassword(environment.getProperty("student.sPassword"));
		studentBean.setsName(environment.getProperty("student.sName"));
		studentBean.setStudentAddress(getStudentAddress());
		return studentBean;
	}
	
	@Bean(name = "myService")
	@Scope("singleton")
	IService getIService() {
		return new ServiceImple();
	}
}
