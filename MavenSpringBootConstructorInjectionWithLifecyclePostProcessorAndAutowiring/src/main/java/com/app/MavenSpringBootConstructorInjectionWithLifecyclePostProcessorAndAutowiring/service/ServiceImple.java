package com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.bean.EmployeeBean;
import com.app.MavenSpringBootConstructorInjectionWithLifecyclePostProcessorAndAutowiring.bean.StudentBean;

@Service
public class ServiceImple implements IService {
	
	@Autowired
	EmployeeBean employee;
	
	@Autowired
	StudentBean student;

	@Override
	public void getEmployeeWithAddress() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.employee.toString());
	}

	@Override
	public void getStudentWithAddress() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.student.toString());
	}
}
