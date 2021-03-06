package com.app.MavenSpringBootManyToManyRelationWithJpaRepositoryAndMysqlThruAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.app.MavenSpringBootManyToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.dto.Student;
import com.app.MavenSpringBootManyToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.dto.Subject;
import com.app.MavenSpringBootManyToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.repository.StudentRepository;
import com.app.MavenSpringBootManyToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.repository.SubjectRepository;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class MavenSpringBootManyToManyRelationWithJpaRepositoryAndMysqlThruAnnotationApplication implements CommandLineRunner {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	SubjectRepository subjectRepository;

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringBootManyToManyRelationWithJpaRepositoryAndMysqlThruAnnotationApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student jack = new Student("Jack");
		Student peter = new Student("Peter");
		
		Subject math = new Subject("Mathematics");
		Subject computer = new Subject("Compter");
		
		/*subjectRepository.save(math);
		subjectRepository.save(computer);*/
		
		Set<Subject> subjects = new HashSet<Subject>();
		subjects.add(math);
		subjects.add(computer);
		
		jack.setSubjects(subjects);
		peter.setSubjects(subjects);
		
		studentRepository.save(jack);
		studentRepository.save(peter);
		
		
		Set<Student> students = new HashSet<Student>();
		students.add(jack);
		students.add(peter);
		
		math.setStudents(students);
		computer.setStudents(students);
		
		subjectRepository.save(math);
		subjectRepository.save(computer);
		
		List<Student> studentLst = studentRepository.findAll();
		List<Subject> subLst = subjectRepository.findAll();
		
		System.out.println(studentLst.size());
		System.out.println(subLst.size());
		
		
		System.out.println("===================Students info:==================");
		studentLst.forEach(student->System.out.println(student.toString()));
		
		System.out.println("===================Students info:==================");
		subLst.forEach(subject->System.out.println(subject.toString()));
	}
}
