package com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml.bean.EmployeeBean;
import com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml.bean.StudentBean;

@Service
public class ServiceImple implements IService {
	
	@Autowired
	private EmployeeBean employee;
	
	@Autowired
	private StudentBean student;

	@Override
	public void getEmployee() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Employee Id Is :: "+this.employee.getEmployeeId());
		System.out.println("Employee Name Is :: "+this.employee.getEmployeeName());
		System.out.println("Employee Salary Is :: "+this.employee.getEmployeeSalary());
	}

	@Override
	public void getEmployeeAddress() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Employee City Is :: "+this.employee.getEmployeeAddress().getCity());
		System.out.println("Employee Pincode Is :: "+this.employee.getEmployeeAddress().getPincode());

	}

	@Override
	public void getEmployeeWithAddress() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.employee.toString());
	}

	@Override
	public void getStudent() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student Id Is :: "+this.student.getStudentId());
		System.out.println("Student Name Is :: "+this.student.getStudentName());
		System.out.println("Student Age Is :: "+this.student.getStudentAge());
	}

	@Override
	public void getStudentAddress() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student City Is :: "+this.student.getStudentAddress().getCity());
		System.out.println("Student Pincode Is :: "+this.student.getStudentAddress().getPincode());

	}

	@Override
	public void getStudentWithAddress() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.student.toString());
	}
}
