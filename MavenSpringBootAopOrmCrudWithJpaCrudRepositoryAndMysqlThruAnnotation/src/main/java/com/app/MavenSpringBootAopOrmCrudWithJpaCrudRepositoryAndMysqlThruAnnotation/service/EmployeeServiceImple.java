package com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO;
import com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dto.EmployeeDTO;
import com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImple implements IEmployeeDAO {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(EmployeeDTO employee) throws Exception {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(EmployeeDTO employee) throws Exception {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(EmployeeDTO employee) throws Exception {
		// TODO Auto-generated method stub
		employeeRepository.delete(employee);
	}

	@Override
	public EmployeeDTO getEmployeeById(int id) throws Exception {
		// TODO Auto-generated method stub
		EmployeeDTO getEmployee = employeeRepository.findById(id).get();
		return getEmployee;
	}

	@Override
	public ArrayList<EmployeeDTO> getAllEmployees() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<EmployeeDTO> employeeList = new ArrayList<EmployeeDTO>();
		employeeRepository.findAll().forEach(emp -> employeeList.add(emp));
		return employeeList;
	}
}
