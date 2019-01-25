package com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao;

import java.util.List;
import com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dto.CustomerDTO;

public interface ICustomerDAO {
	
	public void saveCustomer(CustomerDTO customer) throws Exception;
	
	public void updateCustomer(CustomerDTO customer) throws Exception;
	
	public void deleteCustomer(String id) throws Exception;
	
	public CustomerDTO getCustomerById(String id) throws Exception;
	
	public List<CustomerDTO> getAllCustomers() throws Exception;
}
