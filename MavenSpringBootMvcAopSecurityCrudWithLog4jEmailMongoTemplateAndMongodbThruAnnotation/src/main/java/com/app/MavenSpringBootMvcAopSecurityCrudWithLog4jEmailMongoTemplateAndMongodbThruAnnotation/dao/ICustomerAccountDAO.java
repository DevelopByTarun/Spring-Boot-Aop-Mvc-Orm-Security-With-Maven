package com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoTemplateAndMongodbThruAnnotation.dao;

import com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoTemplateAndMongodbThruAnnotation.model.CustomerDTO;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ICustomerAccountDAO {

    public void saveCustomerAccountDetails(CustomerDTO customeraccountDTO) throws Exception;

    public void updateCustomerAccountDetails(CustomerDTO customeraccountDTO) throws Exception;

    public void deleteCustomerAccountDetails(String customerId) throws Exception;

    public CustomerDTO getCustomerAccountDetailsById(String customerId) throws Exception;

    public List<CustomerDTO> getAllCustomersAccountDetails() throws Exception;
}
