package com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "employee")
public class EmployeeBean {
	
	public EmployeeBean() {
		// TODO Auto-generated constructor stub
		System.out.println("this is default constructor of employee bean is called");
	}

	@NotBlank
	private int employeeId;
	
	@NotBlank
	private String employeeName;
	
	@NotBlank
	private int employeeSalary;
	
	@NotNull
	@Autowired
	@Qualifier(value = "employee")
	private AddressBean employeeAddress;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public AddressBean getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(AddressBean employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("this is post construct method of employee bean is called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("this is pre destroy method of employee bean is called");
	}

	@Override
	public String toString() {
		return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeAddress=" + employeeAddress + "]";
	}
}
