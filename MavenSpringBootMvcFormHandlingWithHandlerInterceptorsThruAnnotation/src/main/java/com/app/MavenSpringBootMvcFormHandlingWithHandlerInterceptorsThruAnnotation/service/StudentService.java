package com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.service;

import org.springframework.stereotype.Service;
import com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.dao.IStudentDAO;
import com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.model.Student;
import com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.model.StudentLogin;

@Service
public class StudentService implements IStudentDAO {
	
	@Override
	public StudentLogin authenticateStudent(StudentLogin studentLogin) {
		// TODO Auto-generated method stub
		StudentLogin studlogin = new StudentLogin();
		studlogin.setUsername(studentLogin.getUsername());
		studlogin.setPassword(studentLogin.getPassword());
		return studlogin;
	}

	@Override
	public Student addStudentDetails(Student student) {
		// TODO Auto-generated method stub
		Student stud = new Student();
		stud.setId(student.getId());
		stud.setName(student.getName());
		stud.setAge(student.getAge());
		stud.setCity(student.getCity());
		return stud;
	}
}
