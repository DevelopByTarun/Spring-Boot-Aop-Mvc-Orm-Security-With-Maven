package com.app.demo.MavenSpringBootWithCoreDemoThruAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import com.app.demo.MavenSpringBootWithCoreDemoThruAnnotation.bean.IStudent;
import com.app.demo.MavenSpringBootWithCoreDemoThruAnnotation.bean.StudentBean;

@Configuration
@ComponentScan(basePackages = "com.app.demo")
public class StudentConfig {
	
	@Bean(name = "istudent")
	@Scope(value = "prototype")
	@Lazy
	IStudent getIStudent() {
		StudentBean student = new StudentBean();
		student.setId(1002);
		student.setName("tarun");
		student.setAge(31);
		student.setCity("auckland");
		return student;
	}
}
