package com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.service;

import java.util.ArrayList;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO;
import com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dto.StudentDTO;

@Service
@Transactional
public class StudentService implements IStudentDAO {
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void saveStudent(StudentDTO student) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.save(student);
	}

	@Override
	public void updateStudent(StudentDTO student) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.update(student);
	}

	@Override
	public void deleteStudent(StudentDTO student) throws Exception {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(student);
	}

	@Override
	public StudentDTO getStudentById(int id) throws Exception {
		// TODO Auto-generated method stub
		StudentDTO studentDTO = hibernateTemplate.get(StudentDTO.class, id);
		return studentDTO;
	}

	@Override
	public ArrayList<StudentDTO> getAllStudents() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<StudentDTO> studentList = new ArrayList<StudentDTO>();
		studentList = (ArrayList<StudentDTO>) hibernateTemplate.loadAll(StudentDTO.class);
		return studentList;
	}
}
