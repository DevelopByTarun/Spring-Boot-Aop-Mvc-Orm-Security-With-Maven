package com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.dao.IAccountDAO;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.model.AccountDTO;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaRepositoryAndMysqlThruAnnotation.repository.AccountRepository;

@Service
@Transactional
public class AccountService implements IAccountDAO {
	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public void updateAccount(AccountDTO account) throws Exception {
		// TODO Auto-generated method stub
		accountRepository.save(account);
	}

	@Override
	public void deleteAccount(AccountDTO account) throws Exception {
		// TODO Auto-generated method stub
		accountRepository.delete(account);
	}

	@Override
	public AccountDTO getAccountByNumber(int number) throws Exception {
		// TODO Auto-generated method stub
		AccountDTO getAccount = accountRepository.findById(number).get();
		return getAccount;
	}

	@Override
	public ArrayList<AccountDTO> getAllAccounts() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<AccountDTO> accountList = new ArrayList<AccountDTO>();
		accountRepository.findAll().forEach(acct -> accountList.add(acct));
		return accountList;
	}
}
