package com.app.MavenSpringBootPropertiesWithPropertySource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootPropertiesWithPropertySource.bean.EmployeeBean;
import com.app.MavenSpringBootPropertiesWithPropertySource.bean.StudentBean;

@Service
public class ServiceImple implements IService {
	
	@Autowired
	private EmployeeBean emp;
	
	@Autowired
	private StudentBean stud;

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

	@Override
	public void getStudent() {
		// TODO Auto-generated method stub
		System.out.println("Student Id Is :: "+this.stud.getSid());
		System.out.println("Student Name Is :: "+this.stud.getSname());
		System.out.println("Student Age Is :: "+this.stud.getAge());
	}

	@Override
	public void getStudentAddress() {
		// TODO Auto-generated method stub
		System.out.println("Student City Is :: "+this.stud.getStudentAddress().getCity());
		System.out.println("Student Pincode Is :: "+this.stud.getStudentAddress().getPincode());
	}

	@Override
	public void getStudentWithAddress() {
		// TODO Auto-generated method stub
		System.out.println(this.stud.toString());
	}

}
