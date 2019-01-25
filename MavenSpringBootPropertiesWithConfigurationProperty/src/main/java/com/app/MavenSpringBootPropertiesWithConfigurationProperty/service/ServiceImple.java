package com.app.MavenSpringBootPropertiesWithConfigurationProperty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootPropertiesWithConfigurationProperty.bean.EmployeeBean;

@Service
public class ServiceImple implements IService {
	
	@Autowired
	private EmployeeBean emp;
	
	@Override
	public void getEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id Is :: "+this.emp.getEid());
		System.out.println("Employee Name Is :: "+this.emp.getEname());
		System.out.println("Employee Salary Is :: "+this.emp.getSalary());
	}

	@Override
	public void getEmployeeAddress() {
		// TODO Auto-generated method stub
		System.out.println("Employee City Is :: "+this.emp.getEmployeeAddress().getCity());
		System.out.println("Employee Pincode Is :: "+this.emp.getEmployeeAddress().getPincode());
	}

	@Override
	public void getEmployeeWithAddress() {
		// TODO Auto-generated method stub
		System.out.println(this.emp.toString());
	}
}
