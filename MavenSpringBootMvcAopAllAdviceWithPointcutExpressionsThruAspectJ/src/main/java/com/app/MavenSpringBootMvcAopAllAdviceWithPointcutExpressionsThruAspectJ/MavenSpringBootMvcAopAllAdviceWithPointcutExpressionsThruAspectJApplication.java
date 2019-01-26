package com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ")
@EnableAutoConfiguration
@SpringBootApplication
public class MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJApplication.class, args);
	}
}
