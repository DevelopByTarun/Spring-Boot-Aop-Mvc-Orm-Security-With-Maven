package com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation")
@EnableAutoConfiguration
@SpringBootApplication
public class MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotationApplication.class, args);
	}
}
