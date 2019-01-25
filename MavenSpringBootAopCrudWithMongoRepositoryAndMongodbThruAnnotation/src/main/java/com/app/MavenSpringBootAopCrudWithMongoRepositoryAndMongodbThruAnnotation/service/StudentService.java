package com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.dao.IStudentDAO;
import com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.dto.StudentDTO;
import com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.repository.StudentRepository;

@Service
public class StudentService implements IStudentDAO {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void saveStudent(StudentDTO student) throws Exception {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public void updateStudent(StudentDTO student) throws Exception {
		// TODO Auto-generated method stub
		StudentDTO getstudent = (StudentDTO) studentRepository.findById(student.getId()).get();
		getstudent.setName(student.getName());
		getstudent.setAge(student.getAge());
		getstudent.setCity(student.getCity());
		studentRepository.save(getstudent);
	}

	@Override
	public void deleteStudent(String id) throws Exception {
		// TODO Auto-generated method stub
		studentRepository.delete(getStudentById(id));
	}

	@Override
	public StudentDTO getStudentById(String id) throws Exception {
		// TODO Auto-generated method stub
		StudentDTO getstudent = (StudentDTO) studentRepository.findById(id).get();
		return getstudent;
	}

	@Override
	public List<StudentDTO> getAllStudents() throws Exception {
		// TODO Auto-generated method stub
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		studentRepository.findAll().forEach(stud -> studentList.add(stud));
		return studentList;
	}
}
