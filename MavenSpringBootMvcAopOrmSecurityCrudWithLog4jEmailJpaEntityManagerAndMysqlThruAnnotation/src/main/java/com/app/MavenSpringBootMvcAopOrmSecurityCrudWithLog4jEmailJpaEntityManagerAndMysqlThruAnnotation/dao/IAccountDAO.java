package com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaEntityManagerAndMysqlThruAnnotation.dao;

import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaEntityManagerAndMysqlThruAnnotation.model.AccountDTO;

@Repository
public interface IAccountDAO {
	
	public void addAccount(AccountDTO account) throws Exception;
	
	public void updateAccount(AccountDTO account) throws Exception;
	
	public void deleteAccount(int id) throws Exception;
	
	public AccountDTO getAccountById(int id) throws Exception;
	
	public ArrayList<AccountDTO> getAllAccounts() throws Exception;
}
