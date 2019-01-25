package com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.bean.EmployeeBean;
import com.app.MavenSpringBootSetterInjectionWithLifecyclePostProcessorAndAutowiring.bean.StudentBean;

@Service
public class ServiceImple implements IService {
	
	@Autowired
	EmployeeBean employee;
	
	@Autowired
	StudentBean student;

	@Override
	public void getEmployee() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Employee Userid Is :: "+this.employee.geteUserid());
		System.out.println("Employee Password Is :: "+this.employee.getePassword());
		System.out.println("Employee Name Is :: "+this.employee.geteName());
	}

	@Override
	public void getEmployeeAddress() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Employee State Is :: "+this.employee.getEmployeeAddress().getState());
		System.out.println("Employee Country Is :: "+this.employee.getEmployeeAddress().getCountry());
	}

	@Override
	public void getEmployeeWithAddress() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.employee.toString());
	}

	@Override
	public void getStudent() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student Userid Is :: "+this.student.getsUserid());
		System.out.println("Student Password Is :: "+this.student.getsPassword());
		System.out.println("Student Name Is :: "+this.student.getsName());
	}

	@Override
	public void getStudentAddress() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student State Is :: "+this.student.getStudentAddress().getState());
		System.out.println("Student Country Is :: "+this.student.getStudentAddress().getCountry());
	}

	@Override
	public void getStudentWithAddress() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.student.toString());
	}
}
