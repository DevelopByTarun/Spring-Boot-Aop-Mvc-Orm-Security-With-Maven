package com.app.MavenSpringBootPropertiesWithPropertySource.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import com.app.MavenSpringBootPropertiesWithPropertySource.bean.AddressBean;
import com.app.MavenSpringBootPropertiesWithPropertySource.bean.EmployeeBean;
import com.app.MavenSpringBootPropertiesWithPropertySource.bean.StudentBean;
import com.app.MavenSpringBootPropertiesWithPropertySource.service.IService;
import com.app.MavenSpringBootPropertiesWithPropertySource.service.ServiceImple;

@Configuration
@ComponentScan(basePackages = "com.app")
@PropertySource("classpath:application.properties")
public class AppConfig {
	
	@Autowired
	Environment environment;
	
	@Bean(name = "employee")
	AddressBean getEmployeeAddress() {
		AddressBean employeeAddress = new AddressBean();
		employeeAddress.setCity(environment.getProperty("employee.address.city"));
		employeeAddress.setPincode(5245222);
		return employeeAddress;
	}
	
	@Bean
	@Lazy
	@Scope("prototype")
	EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(1001);
		employeeBean.setEname(environment.getProperty("employee.ename"));
		employeeBean.setSalary(108569);
		employeeBean.setEmployeeAddress(getEmployeeAddress());
		return employeeBean;
	}
	
	@Bean(name = "student")
	AddressBean getStudentAddress() {
		AddressBean studentAddress = new AddressBean();
		studentAddress.setCity(environment.getProperty("student.address.city"));
		studentAddress.setPincode(110089);
		return studentAddress;
	}
	
	@Bean
	@Lazy
	@Scope("prototype")
	StudentBean getStudentBean() {
		StudentBean studentBean = new StudentBean();
		studentBean.setSid(1002);
		studentBean.setSname(environment.getProperty("student.sname"));
		studentBean.setAge(26);
		studentBean.setStudentAddress(getStudentAddress());
		return studentBean;
	}
	
	@Bean(name = "myService")
	IService getIService() {
		return new ServiceImple();
	}
}
