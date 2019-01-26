package com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation.service;

import org.springframework.stereotype.Service;
import com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation.dao.IEmployeeDAO;
import com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation.model.Employee;
import com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation.model.EmployeeLogin;

@Service
public class EmployeeService implements IEmployeeDAO {
	
	public EmployeeLogin authenticateEmployee(EmployeeLogin employeeLogin) {
		// TODO Auto-generated method stub
		EmployeeLogin emplogin = new EmployeeLogin();
		emplogin.setUsername(employeeLogin.getUsername());
		emplogin.setPassword(employeeLogin.getPassword());
		return emplogin;
	}

	public Employee addEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(employee.getId());
		emp.setName(employee.getName());
		emp.setAge(employee.getAge());
		emp.setSalary(employee.getSalary());
		return emp;
	}
}
