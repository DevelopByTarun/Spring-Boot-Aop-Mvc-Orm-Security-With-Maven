package com.app.MavenSpringBootMvcSendingEmailAttachmentWithGmailServerThruAnnotation.config;

import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.app.MavenSpringBootMvcSendingEmailAttachmentWithGmailServerThruAnnotation")
public class EmailAttachmentConfig {
	
	 @Autowired
	 private Environment env;
	 
	 public Properties getJavaMailProperties() {
		 Properties props = new Properties();
		 props.put("mail.transport.protocol", env.getProperty("mail.protocol"));
		 props.put("mail.smtp.auth", env.getProperty("mail.auth"));
		 props.put("mail.smtp.starttls.enable", env.getProperty("mail.starttls"));
		 props.put("mail.debug", env.getProperty("mail.debug"));
		 return props;
	 }
	 
	 @Bean
	 public JavaMailSender getJavaMailSender() {
		 JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		 mailSender.setHost(env.getProperty("mail.host"));
		 mailSender.setPort(587);
		 mailSender.setUsername(env.getProperty("mail.username"));
		 mailSender.setPassword(env.getProperty("mail.password"));
		 mailSender.setJavaMailProperties(getJavaMailProperties());
		 return mailSender;
	 }
}
