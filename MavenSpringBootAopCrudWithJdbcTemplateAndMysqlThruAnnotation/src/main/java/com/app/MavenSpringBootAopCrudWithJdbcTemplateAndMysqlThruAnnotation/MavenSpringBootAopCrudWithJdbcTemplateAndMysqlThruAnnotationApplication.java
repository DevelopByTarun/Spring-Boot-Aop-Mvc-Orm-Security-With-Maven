package com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation;

import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.dao.IPersonDAO;
import com.app.MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotation.dto.Person;

@SpringBootApplication
@EnableAutoConfiguration
public class MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotationApplication {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MavenSpringBootAopCrudWithJdbcTemplateAndMysqlThruAnnotationApplication.class, args);
		IPersonDAO personDAO = (IPersonDAO) context.getBean("iperson");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("");
    		System.out.println("1. Create Person");
    		System.out.println("2. Get All Persons");
    		System.out.println("3. Delete Person");
    		System.out.println("4. Update Person");
    		System.out.println("5. Get Person By Id");
    		System.out.println("6. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			System.out.print("Enter Person Id :: ");
    			Long id = sc.nextLong();
    			
    			System.out.print("Enter Person Age :: ");
    			Integer age = sc.nextInt();
    			
    			System.out.print("Enter Person Firstname :: ");
    			String fname = sc.next();
    			
    			System.out.print("Enter Person Lastname :: ");
    			String lname = sc.next();
    			
    			Person person = new Person(id, age, fname, lname);
    			personDAO.createPerson(person);
    			if(person != null) {
    				System.out.println("Person Added Successfully");
    			}
    			else {
    				System.out.println("Unable To Add Person");
    			}
    		}
    		else if(choice == 2) {
    			List<Person> personList = personDAO.getAllPersons();
    			if(personList != null && personList.size() > 0) {
    				for(Person p : personList) {
    					System.out.println("Person Id Is :: "+p.getId());
    					System.out.println("Person Age Is :: "+p.getAge());
    					System.out.println("Person FirstName Is :: "+p.getFirstName());
    					System.out.println("Person LastName Is :: "+p.getLastName());
    					System.out.println("");
    				}
    			}
    		}
    		else if(choice == 3) {
    			System.out.print("Enter Person Id Want To Delete :: ");
    			Long id = sc.nextLong();
    			
    			Person person = new Person();
    			person.setId(id);
    			
    			personDAO.deletePerson(person);
    			if(person != null) {
    				System.out.println("Person Deleted Successfully");
    			}
    			else {
    				System.out.println("Unable To Delete Person");
    			}
    		}
    		else if(choice == 4) {
    			System.out.print("Enter Person Id Want To Update Record :: ");
    			Long id = sc.nextLong();
    			
    			System.out.print("Enter New Age :: ");
    			Integer age = sc.nextInt();
    			
    			System.out.print("Enter New Firstname :: ");
    			String fname = sc.next();
    			
    			System.out.print("Enter New Lastname :: ");
    			String lname = sc.next();
    			
    			Person personById = personDAO.getPersonById(id);
    			personById.setAge(age);
    			personById.setFirstName(fname);
    			personById.setLastName(lname);
    			
    			personDAO.updatePerson(personById);
    			if(personById != null) {
    				System.out.println("Person Updated Successfully");
    			}
    			else {
    				System.out.println("Unable To Update Person");
    			}
    		}
    		else if(choice == 5) {
    			System.out.print("Enter Person Id Want To Fetch Record :: ");
    			Long id = sc.nextLong();
    			
    			Person personById = personDAO.getPersonById(id);
    			if(personById != null) {
    				System.out.println(personById);
    			}
    			else {
    				System.out.println("Unable To Get Person");
    			}
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
		}
	}
}
