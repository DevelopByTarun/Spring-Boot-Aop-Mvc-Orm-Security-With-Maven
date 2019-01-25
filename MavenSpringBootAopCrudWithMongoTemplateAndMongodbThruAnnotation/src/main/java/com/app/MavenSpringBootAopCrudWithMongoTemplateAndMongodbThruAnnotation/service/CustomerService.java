package com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dao.ICustomerDAO;
import com.app.MavenSpringBootAopCrudWithMongoTemplateAndMongodbThruAnnotation.dto.CustomerDTO;

@Service
public class CustomerService implements ICustomerDAO {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public void saveCustomer(CustomerDTO customer) throws Exception {
		// TODO Auto-generated method stub
		mongoTemplate.save(customer);
	}

	@Override
	public void updateCustomer(CustomerDTO customer) throws Exception {
		// TODO Auto-generated method stub
		CustomerDTO getCust = mongoTemplate.findById(customer.getId(), CustomerDTO.class);
		getCust.setId(customer.getId());
		getCust.setFirstName(customer.getFirstName());
		getCust.setLastName(customer.getLastName());
		getCust.setAge(customer.getAge());
		getCust.setState(customer.getState());
		getCust.setCountry(customer.getCountry());
		mongoTemplate.save(getCust);
	}

	@Override
	public void deleteCustomer(String id) throws Exception {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		mongoTemplate.findAndRemove(query, CustomerDTO.class);
	}

	@Override
	public CustomerDTO getCustomerById(String id) throws Exception {
		// TODO Auto-generated method stub
		CustomerDTO getCust = mongoTemplate.findById(id, CustomerDTO.class);
		return getCust;
	}

	@Override
	public List<CustomerDTO> getAllCustomers() throws Exception {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(CustomerDTO.class);
	}
}
