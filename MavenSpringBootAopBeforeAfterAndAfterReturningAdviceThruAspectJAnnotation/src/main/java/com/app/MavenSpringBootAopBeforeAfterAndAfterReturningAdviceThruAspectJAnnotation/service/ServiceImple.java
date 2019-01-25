package com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.bean.EmployeeBean;
import com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.bean.StudentBean;

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
	public Object getEmployeeAddress() throws Exception {
		// TODO Auto-generated method stub
		return this.employee.getEmployeeAddress();

	}
	
	@Override
	public Object getEmployeeWithAddress() throws Exception {
		// TODO Auto-generated method stub
		return this.employee.toString();
	}
	
	@Override
	public void getEmployeeAnnualSalaryPackage() throws Exception {
		// TODO Auto-generated method stub
		int monthlySalary = this.employee.getEmployeeSalary();
		int result = monthlySalary * 12;
		System.out.println("Employee Annual Salary Package Is :: "+result);
	}

	@Override
	public void getStudent() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student Id Is :: "+this.student.getStudentId());
		System.out.println("Student Name Is :: "+this.student.getStudentName());
		System.out.println("Student Age Is :: "+this.student.getStudentAge());
	}

	@Override
	public Object getStudentAddress() throws Exception {
		// TODO Auto-generated method stub
		return this.student.getStudentAddress();

	}

	@Override
	public Object getStudentWithAddress() throws Exception {
		// TODO Auto-generated method stub
		return this.student.toString();
	}
}
