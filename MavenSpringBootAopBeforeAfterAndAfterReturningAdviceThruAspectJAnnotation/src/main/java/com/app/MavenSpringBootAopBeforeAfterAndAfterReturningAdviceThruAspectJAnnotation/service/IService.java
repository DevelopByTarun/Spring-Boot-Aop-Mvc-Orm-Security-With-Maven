package com.app.MavenSpringBootAopBeforeAfterAndAfterReturningAdviceThruAspectJAnnotation.service;

public interface IService {
	
	public void getEmployee() throws Exception;
	
	public Object getEmployeeAddress() throws Exception;
	
	public Object getEmployeeWithAddress() throws Exception;
	
	public void getEmployeeAnnualSalaryPackage() throws Exception;
	
	public void getStudent() throws Exception;
	
	public Object getStudentAddress() throws Exception;
	
	public Object getStudentWithAddress() throws Exception;
}
