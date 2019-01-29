package com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaEntityManagerAndMysqlThruAnnotation.service;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaEntityManagerAndMysqlThruAnnotation.dao.IAccountDAO;
import com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaEntityManagerAndMysqlThruAnnotation.model.AccountDTO;

@Service
@Transactional
public class AccountService implements IAccountDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;

	@Override
	public void addAccount(AccountDTO account) throws Exception {
		// TODO Auto-generated method stub
		entityManager.persist(account);
	}

	@Override
	public void updateAccount(AccountDTO account) throws Exception {
		// TODO Auto-generated method stub
		AccountDTO accountDTO = getAccountById(account.getId());
		accountDTO.setNumber(account.getNumber());
		accountDTO.setType(account.getType());
		accountDTO.setBank(account.getBank());
		accountDTO.setStatus(account.getStatus());
		entityManager.flush();
	}

	@Override
	public void deleteAccount(int id) throws Exception {
		// TODO Auto-generated method stub
		entityManager.remove(getAccountById(id));
	}

	@Override
	public AccountDTO getAccountById(int id) throws Exception {
		// TODO Auto-generated method stub
		return entityManager.find(AccountDTO.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<AccountDTO> getAllAccounts() throws Exception {
		// TODO Auto-generated method stub
		String hql = "FROM AccountDTO as account ORDER BY account.id";
		return (ArrayList<AccountDTO>) entityManager.createQuery(hql).getResultList();
	}
}
