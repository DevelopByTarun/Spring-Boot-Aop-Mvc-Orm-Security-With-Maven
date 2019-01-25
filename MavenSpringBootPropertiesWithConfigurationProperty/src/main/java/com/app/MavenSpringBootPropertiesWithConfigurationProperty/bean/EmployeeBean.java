package com.app.MavenSpringBootPropertiesWithConfigurationProperty.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component(value = "emp")
@ConfigurationProperties(ignoreUnknownFields = false, prefix = "emps")
public class EmployeeBean {
	
	@NotBlank
	private int eid;
	
	@NotBlank
	private String ename;
	
	@NotBlank
	private int salary;
	
	@Autowired
	@NotNull
	private AddressBean employeeAddress;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public AddressBean getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(AddressBean employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", employeeAddress="
				+ employeeAddress + "]";
	}
}
