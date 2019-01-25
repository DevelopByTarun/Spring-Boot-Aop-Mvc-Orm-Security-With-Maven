package com.app.MavenSpringBootMvcWithBeanInheritance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.app.MavenSpringBootMvcWithBeanInheritance")
@EnableAutoConfiguration
@SpringBootApplication
public class MavenSpringBootMvcWithBeanInheritanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringBootMvcWithBeanInheritanceApplication.class, args);
	}
}
