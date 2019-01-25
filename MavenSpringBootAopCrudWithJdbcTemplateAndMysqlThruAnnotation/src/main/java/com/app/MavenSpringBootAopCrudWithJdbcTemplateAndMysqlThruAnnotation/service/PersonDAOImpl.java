package com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.dao.IPersonDAO;
import com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.dto.Person;
import com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.utility.PersonMapper;

@Service
@Transactional
public class PersonDAOImpl implements IPersonDAO, DataBaseQuery {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Person getPersonById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_FIND_PERSON, new Object[] { id }, new PersonMapper());
	}

	@Override
	public List<Person> getAllPersons() throws Exception {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_ALL, new PersonMapper());
	}

	@Override
	public boolean deletePerson(Person person) throws Exception {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_DELETE_PERSON, person.getId()) > 0;
	}

	@Override
	public boolean updatePerson(Person person) throws Exception {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_UPDATE_PERSON, person.getFirstName(), person.getLastName(), person.getAge(),
				person.getId()) > 0;
	}

	@Override
	public boolean createPerson(Person person) throws Exception {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_INSERT_PERSON, person.getId(), person.getFirstName(), person.getLastName(),
				person.getAge()) > 0;
	}
}
