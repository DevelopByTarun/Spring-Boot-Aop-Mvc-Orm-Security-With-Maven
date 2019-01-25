package com.app.demo.MavenSpringBootWithCoreDemoThruAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.app.demo.MavenSpringBootWithCoreDemoThruAnnotation.bean.IStudent;

@SpringBootApplication
public class MavenSpringBootWithCoreDemoThruAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MavenSpringBootWithCoreDemoThruAnnotationApplication.class, args);
		IStudent stud = (IStudent) context.getBean("istudent");
		stud.getStudent();
	}
}
