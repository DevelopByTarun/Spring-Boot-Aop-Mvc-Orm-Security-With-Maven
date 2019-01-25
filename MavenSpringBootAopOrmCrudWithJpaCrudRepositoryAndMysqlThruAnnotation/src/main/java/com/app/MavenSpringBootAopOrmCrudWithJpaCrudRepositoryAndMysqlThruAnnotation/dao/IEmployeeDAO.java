package com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao;

import java.util.ArrayList;
import com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dto.EmployeeDTO;

public interface IEmployeeDAO {
	
	public void saveEmployee(EmployeeDTO employee) throws Exception;
	
	public void updateEmployee(EmployeeDTO employee) throws Exception;
	
	public void deleteEmployee(EmployeeDTO employee) throws Exception;
	
	public EmployeeDTO getEmployeeById(int id) throws Exception;
	
	public ArrayList<EmployeeDTO> getAllEmployees() throws Exception;
}
