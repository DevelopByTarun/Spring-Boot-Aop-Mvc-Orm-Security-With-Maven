package com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation;

import java.util.ArrayList;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dao.IEmployeeDAO;
import com.app.MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotation.dto.EmployeeDTO;

@SpringBootApplication
@EnableAutoConfiguration
public class MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotationApplication {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(MavenSpringBootAopOrmCrudWithJpaCrudRepositoryAndMysqlThruAnnotationApplication.class, args);
		IEmployeeDAO service = (IEmployeeDAO) context.getBean("employeeDAO");
		((AbstractApplicationContext)context).start();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("");
    		System.out.println("1. Add Employee");
    		System.out.println("2. Update Employee");
    		System.out.println("3. Delete Employee");
    		System.out.println("4. Fetch All Employees");
    		System.out.println("5. Fetch Employee By Id");
    		System.out.println("6. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			System.out.print("Enter Employee Name :: ");
    			String name = sc.next();
    			
    			System.out.print("Enter Employee City :: ");
    			String city = sc.next();
    			
    			System.out.print("Enter Employee Country :: ");
    			String country = sc.next();
    			
    			System.out.print("Enter Employee Salary :: ");
    			double salary = sc.nextDouble();
    			
    			EmployeeDTO addEmployee = new EmployeeDTO();
    			addEmployee.setName(name);
    			addEmployee.setCity(city);
    			addEmployee.setCountry(country);
    			addEmployee.setSalary(salary);
    			
    			service.saveEmployee(addEmployee);
    			if(addEmployee != null) {
    				System.out.println("Employee Added Successfully");
    			}
    			else {
    				System.out.println("Unable To Add Employee");
    			}
    		}
    		else if(choice == 2) {
    			System.out.print("Enter Employee Name :: ");
    			String name = sc.next();
    			
    			System.out.print("Enter Employee City :: ");
    			String city = sc.next();
    			
    			System.out.print("Enter Employee Country :: ");
    			String country = sc.next();
    			
    			System.out.print("Enter Employee Salary :: ");
    			double salary = sc.nextDouble();
    			
    			System.out.print("Enter Employee Id Want To Update :: ");
    			int id = sc.nextInt();
    			
    			EmployeeDTO updateEmployee = new EmployeeDTO();
    			updateEmployee.setName(name);
    			updateEmployee.setCity(city);
    			updateEmployee.setCountry(country);
    			updateEmployee.setSalary(salary);
    			updateEmployee.setId(id);
    			
    			service.updateEmployee(updateEmployee);
    			if(updateEmployee != null) {
    				System.out.println("Employee Updated Successfully");
    			}
    			else {
    				System.out.println("Unable To Update Employee");
    			}
    		}
    		else if(choice == 3) {
    			System.out.print("Enter Employee Id Want To Delete :: ");
    			int id = sc.nextInt();
    			
    			EmployeeDTO deleteEmployee = new EmployeeDTO();
    			deleteEmployee.setId(id);
    			
    			service.deleteEmployee(deleteEmployee);
    			if(deleteEmployee != null) {
    				System.out.println("Employee Deleted Successfully");
    			}
    			else {
    				System.out.println("Unable To Delete Employee");
    			}
    		}
    		else if(choice == 4) {
    			ArrayList<EmployeeDTO> employeeList = service.getAllEmployees();
    			for(EmployeeDTO emps : employeeList) {
    				System.out.println("Employee Id Is :: "+emps.getId());
    				System.out.println("Employee Name Is :: "+emps.getName());
    				System.out.println("Employee City Is :: "+emps.getCity());
    				System.out.println("Employee Country Is :: "+emps.getCountry());
    				System.out.println("Employee Salary Is :: "+emps.getSalary());
    				System.out.println("");
    			}
    		}
    		else if(choice == 5) {
    			System.out.print("Enter Employee Id Want To Fetch Record :: ");
    			int id = sc.nextInt();
    			
    			EmployeeDTO searchEmployee = service.getEmployeeById(id);
    			if(searchEmployee != null) {
    				System.out.println(searchEmployee.toString());
    			}
    			else {
    				System.out.println("Unable To Search Employee");
    			}
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
		}
	}
}
