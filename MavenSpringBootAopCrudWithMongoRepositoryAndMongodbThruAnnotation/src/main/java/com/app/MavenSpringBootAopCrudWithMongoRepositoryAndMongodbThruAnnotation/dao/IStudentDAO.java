package com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.dao;

import java.util.List;
import com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.dto.StudentDTO;

public interface IStudentDAO {
	
	public void saveStudent(StudentDTO student) throws Exception;
	
	public void updateStudent(StudentDTO student) throws Exception;
	
	public void deleteStudent(String id) throws Exception;
	
	public StudentDTO getStudentById(String id) throws Exception;
	
	public List<StudentDTO> getAllStudents() throws Exception;
}
