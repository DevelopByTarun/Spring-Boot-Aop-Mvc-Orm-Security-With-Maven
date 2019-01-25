package com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao;

import java.util.ArrayList;
import com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dto.StudentDTO;

public interface IStudentDAO {
	
	public void saveStudent(StudentDTO student) throws Exception;
	
	public void updateStudent(StudentDTO student) throws Exception;
	
	public void deleteStudent(StudentDTO student) throws Exception;
	
	public StudentDTO getStudentById(int id) throws Exception;
	
	public ArrayList<StudentDTO> getAllStudents() throws Exception;
}
