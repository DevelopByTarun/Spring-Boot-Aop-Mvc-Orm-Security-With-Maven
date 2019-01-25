package com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation;

import java.util.ArrayList;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dao.IStudentDAO;
import com.app.MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotation.dto.StudentDTO;

@SpringBootApplication
@EnableAutoConfiguration
public class MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotationApplication {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MavenSpringBootAopOrmCrudWithHibernateTemplateAndMysqlThruAnnotationApplication.class, args);
		IStudentDAO service = (IStudentDAO) context.getBean("myService");
		((AbstractApplicationContext)context).start();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("");
    		System.out.println("1. Add Student");
    		System.out.println("2. Update Student");
    		System.out.println("3. Delete Student");
    		System.out.println("4. Fetch All Students");
    		System.out.println("5. Fetch Student By Id");
    		System.out.println("6. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			System.out.print("Enter Student Name :: ");
    			String name = sc.next();
    			
    			System.out.print("Enter Student Age :: ");
    			int age = sc.nextInt();
    			
    			System.out.print("Enter Student City :: ");
    			String city = sc.next();
    			
    			System.out.print("Enter Student Country :: ");
    			String country = sc.next();
    			
    			StudentDTO addStudent = new StudentDTO();
    			addStudent.setName(name);
    			addStudent.setAge(age);
    			addStudent.setCity(city);
    			addStudent.setCountry(country);
    			
    			service.saveStudent(addStudent);
    			if(addStudent != null) {
    				System.out.println("Student Added Successfully");
    			}
    			else {
    				System.out.println("Unable To Add Student");
    			}
    		}
    		else if(choice == 2) {
    			System.out.print("Enter Student Name :: ");
    			String name = sc.next();
    			
    			System.out.print("Enter Student Age :: ");
    			int age = sc.nextInt();
    			
    			System.out.print("Enter Student City :: ");
    			String city = sc.next();
    			
    			System.out.print("Enter Student Country :: ");
    			String country = sc.next();
    			
    			System.out.print("Enter Student Id Want To Update :: ");
    			int id = sc.nextInt();
    			
    			StudentDTO updateStudent = new StudentDTO();
    			updateStudent.setName(name);
    			updateStudent.setAge(age);
    			updateStudent.setCity(city);
    			updateStudent.setCountry(country);
    			updateStudent.setId(id);
    			
    			service.updateStudent(updateStudent);
    			if(updateStudent != null) {
    				System.out.println("Student Updated Successfully");
    			}
    			else {
    				System.out.println("Unable To Update Student");
    			}
    		}
    		else if(choice == 3) {
    			System.out.print("Enter Student Id Want To Delete :: ");
    			int id = sc.nextInt();
    			
    			StudentDTO deleteStudent = new StudentDTO();
    			deleteStudent.setId(id);
    			
    			service.deleteStudent(deleteStudent);
    			if(deleteStudent != null) {
    				System.out.println("Student Deleted Successfully");
    			}
    			else {
    				System.out.println("Unable To Delete Student");
    			}
    		}
    		else if(choice == 4) {
    			ArrayList<StudentDTO> studentList = service.getAllStudents();
    			for(StudentDTO stud : studentList) {
    				System.out.println("Student Id Is :: "+stud.getId());
    				System.out.println("Student Name Is :: "+stud.getName());
    				System.out.println("Student Age Is :: "+stud.getAge());
    				System.out.println("Student City Is :: "+stud.getCity());
    				System.out.println("Student Country Is :: "+stud.getCountry());
    				System.out.println("");
    			}
    		}
    		else if(choice == 5) {
    			System.out.print("Enter Student Id Want To Fetch Record :: ");
    			int id = sc.nextInt();
    			
    			StudentDTO searchStudent = service.getStudentById(id);
    			if(searchStudent != null) {
    				System.out.println(searchStudent.toString());
    			}
    			else {
    				System.out.println("Unable To Search Student");
    			}
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
		}
	}
}
