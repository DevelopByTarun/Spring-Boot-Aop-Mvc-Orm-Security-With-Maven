package com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.dao;

import com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.model.Student;
import com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.model.StudentLogin;

public interface IStudentDAO {
	
	public StudentLogin authenticateStudent(StudentLogin studentLogin);
	
	public Student addStudentDetails(Student student);
}
