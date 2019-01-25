package com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml.bean.AddressBean;
import com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml.bean.EmployeeBean;
import com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml.bean.StudentBean;
import com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml.service.IService;
import com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml.service.ServiceImple;

@Configuration
@ComponentScan(basePackages = "com.app")
public class AppConfig {
	
	@Bean(name = "employee")
	@Scope("singleton")
	AddressBean getEmployeeAddress() {
		AddressBean employeeAddress = new AddressBean();
		employeeAddress.setCity("Sydney");
		employeeAddress.setPincode(3131521);
		return employeeAddress;
	}
	
	@Bean
	@Scope("singleton")
	@Lazy
	EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmployeeId(1001);
		employeeBean.setEmployeeName("Tarun");
		employeeBean.setEmployeeSalary(108675);
		employeeBean.setEmployeeAddress(getEmployeeAddress());
		return employeeBean;
	}
	
	@Bean(name = "student")
	@Scope("singleton")
	AddressBean getStudentAddress() {
		AddressBean studentAddress = new AddressBean();
		studentAddress.setCity("NewDelhi");
		studentAddress.setPincode(110089);
		return studentAddress;
	}
	
	@Bean
	@Scope("singleton")
	@Lazy
	StudentBean getStudentBean() {
		StudentBean studentBean = new StudentBean();
		studentBean.setStudentId(1002);
		studentBean.setStudentName("Varun");
		studentBean.setStudentAge(26);
		studentBean.setStudentAddress(getStudentAddress());
		return studentBean;
	}
	
	@Bean(name = "iservice")
	@Scope("singleton")
	@Lazy
	IService getIService() {
		return new ServiceImple();
	}
}
