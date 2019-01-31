package com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.dao;

import java.util.ArrayList;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.model.AccountDTO;

public interface IAccountDAO {
	
	public void updateAccount(AccountDTO account) throws Exception;
	
	public void deleteAccount(AccountDTO account) throws Exception;
	
	public AccountDTO getAccountByNumber(int number) throws Exception;
	
	public ArrayList<AccountDTO> getAllAccounts() throws Exception;
}
