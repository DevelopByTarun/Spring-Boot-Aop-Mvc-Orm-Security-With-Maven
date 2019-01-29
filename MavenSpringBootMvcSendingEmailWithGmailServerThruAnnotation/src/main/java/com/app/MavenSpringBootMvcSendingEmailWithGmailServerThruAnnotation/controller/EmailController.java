package com.app.MavenSpringBootMvcSendingEmailWithGmailServerThruAnnotation.controller;

import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
	public ModelAndView sendEmailThroughSpring(@RequestParam("from") String from, 
			@RequestParam("to") String to, @RequestParam("subject") String subject,
			@RequestParam("text") String text) throws MessagingException {
		// Create a Simple MailMessage
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom(from);
		mailMessage.setTo(to);
		mailMessage.setSubject(subject);
		mailMessage.setText(text);
		// Send Message
		this.mailSender.send(mailMessage);
		ModelAndView model = new ModelAndView();
		model.addObject("result", "Email Sent Successfully....");
		model.setViewName("success");
		return model;
	}
}
