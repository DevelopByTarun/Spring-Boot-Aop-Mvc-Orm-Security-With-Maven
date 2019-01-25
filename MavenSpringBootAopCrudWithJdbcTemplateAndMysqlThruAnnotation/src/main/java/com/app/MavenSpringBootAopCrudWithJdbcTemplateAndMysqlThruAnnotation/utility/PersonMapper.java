package com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.utility;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.dto.Person;

public class PersonMapper implements RowMapper<Person> {
	
	public Person mapRow(ResultSet resultSet, int i) throws SQLException {
		Person person = new Person();
		person.setId(resultSet.getLong("id"));
		person.setFirstName(resultSet.getString("first_name"));
		person.setLastName(resultSet.getString("last_name"));
		person.setAge(resultSet.getInt("age"));
		return person;
	}
}
