package com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation.dao;

import com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation.model.Employee;
import com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation.model.EmployeeLogin;

public interface IEmployeeDAO {
	
	public EmployeeLogin authenticateEmployee(EmployeeLogin employeeLogin);
	
	public Employee addEmployeeDetails(Employee employee);
}
