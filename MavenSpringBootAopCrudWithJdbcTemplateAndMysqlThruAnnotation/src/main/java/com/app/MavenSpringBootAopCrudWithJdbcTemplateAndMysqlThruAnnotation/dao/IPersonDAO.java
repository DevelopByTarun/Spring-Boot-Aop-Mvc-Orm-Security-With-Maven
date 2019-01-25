package com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.dao;

import java.util.List;
import com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.dto.Person;

public interface IPersonDAO {
	
	public Person getPersonById(Long id) throws Exception;

	public List<Person> getAllPersons() throws Exception;

	public boolean deletePerson(Person person) throws Exception;

	public boolean updatePerson(Person person) throws Exception;

	public boolean createPerson(Person person) throws Exception;
}
