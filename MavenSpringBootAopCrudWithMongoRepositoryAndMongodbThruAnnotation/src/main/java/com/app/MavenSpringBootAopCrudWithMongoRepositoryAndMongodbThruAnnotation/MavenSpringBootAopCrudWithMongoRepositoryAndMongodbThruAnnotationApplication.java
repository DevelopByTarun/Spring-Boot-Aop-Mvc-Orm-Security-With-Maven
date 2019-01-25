package com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation;

import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.dao.IStudentDAO;
import com.app.MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotation.dto.StudentDTO;

@SpringBootApplication
@EnableAutoConfiguration
public class MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotationApplication {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MavenSpringBootAopCrudWithMongoRepositoryAndMongodbThruAnnotationApplication.class, args);
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
    			System.out.print("Enter Student Id :: ");
    			String id = sc.next();
    			
    			System.out.print("Enter Student Name :: ");
    			String name = sc.next();
    			
    			System.out.print("Enter Student Age :: ");
    			int age = sc.nextInt();
    			
    			System.out.print("Enter Student City :: ");
    			String city = sc.next();
    			
       			StudentDTO addStudent = new StudentDTO();
       			addStudent.setId(id);
       			addStudent.setName(name);
       			addStudent.setAge(age);
       			addStudent.setCity(city);
    			
    			service.saveStudent(addStudent);
    			if(addStudent != null) {
    				System.out.println("Student Added Successfully");
    			}
    			else {
    				System.out.println("Unable To Add Student");
    			}
    		}
    		else if(choice == 2) {
    			System.out.print("Enter Student Id Want To Update :: ");
    			String id = sc.next();
    			
    			System.out.print("Enter New Name :: ");
    			String name = sc.next();
    			
    			System.out.print("Enter New Age :: ");
    			int age = sc.nextInt();
    			
    			System.out.print("Enter New City :: ");
    			String city = sc.next();
    			
       			StudentDTO updtStudent = new StudentDTO();
       			updtStudent.setId(id);
       			updtStudent.setName(name);
       			updtStudent.setAge(age);
       			updtStudent.setCity(city);
    			
    			service.updateStudent(updtStudent);
    			if(service != null) {
    				System.out.println("Student Updated Successfully");
    			}
    			else {
    				System.out.println("Unable To Update Student");
    			}
    		}
    		else if(choice == 3) {
    			System.out.print("Enter Student Id Want To Delete :: ");
    			String id = sc.next();
    			
    			service.deleteStudent(id);
    			if(service != null) {
    				System.out.println("Student Deleted Successfully");
    			}
    			else {
    				System.out.println("Unable To Delete Student");
    			}
    		}
    		else if(choice == 4) {
    			List<StudentDTO> studList = service.getAllStudents();
    			if(studList != null && studList.size() > 0) {
    				for(StudentDTO students : studList) {
        				System.out.println("Student Id Is :: "+students.getId());
        				System.out.println("Student Name Is :: "+students.getName());
        				System.out.println("Student Age Is :: "+students.getAge());
        				System.out.println("Student City Is :: "+students.getCity());
        				System.out.println("");
        			}
    			}
    			else {
    				System.out.println("Unable To Find Students");
    			}
    		}
    		else if(choice == 5) {
    			System.out.print("Enter Student Id Want To Fetch Record :: ");
    			String id = sc.next();
    			
    			StudentDTO search = service.getStudentById(id);
    			if(search != null) {
    				System.out.println(search);
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
