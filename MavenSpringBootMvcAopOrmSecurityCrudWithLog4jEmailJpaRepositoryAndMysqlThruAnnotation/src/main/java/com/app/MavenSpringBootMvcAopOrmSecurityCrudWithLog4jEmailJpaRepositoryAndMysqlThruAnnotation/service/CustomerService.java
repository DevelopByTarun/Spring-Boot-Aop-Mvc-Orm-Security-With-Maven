package com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.dao.ICustomerDAO;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.model.CustomerDTO;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService implements ICustomerDAO {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void addCustomer(CustomerDTO customer) throws Exception {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
	}

	@Override
	public void updateCustomer(CustomerDTO customer) throws Exception {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(CustomerDTO customer) throws Exception {
		// TODO Auto-generated method stub
		customerRepository.delete(customer);
	}

	@Override
	public CustomerDTO getCustomerById(int id) throws Exception {
		// TODO Auto-generated method stub
		CustomerDTO getCustomer = customerRepository.findById(id).get();
		return getCustomer;
	}

	@Override
	public ArrayList<CustomerDTO> getAllCustomers() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<CustomerDTO> customerList = new ArrayList<CustomerDTO>();
		customerRepository.findAll().forEach(cust -> customerList.add(cust));
		return customerList;
	}
}
