package com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation.dao;

import java.util.ArrayList;
import com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation.model.CompanyDTO;

public interface ICompanyAndContactDAO {
	
	public void addCompanyAndContact(CompanyDTO companyandcontact) throws Exception;
	
	public void updateCompanyAndContact(CompanyDTO companyandcontact) throws Exception;
	
	public void deleteCompanyAndContact(String companyId) throws Exception;
	
	public CompanyDTO getCompanyAndContactById(String companyId) throws Exception;
	
	public ArrayList<CompanyDTO> getAllCompanyAndContact() throws Exception;
}
