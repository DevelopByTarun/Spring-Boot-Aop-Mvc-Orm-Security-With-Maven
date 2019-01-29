package com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaEntityManagerAndMysqlThruAnnotation.controller;

import java.io.File;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {
	
	private Logger logger = Logger.getLogger(EmailController.class);
	
	@Autowired
	private JavaMailSender mailSender;
		
	@RequestMapping(value = "/email-account", method = RequestMethod.GET)
	public ModelAndView showEmailPage() {
		logger.debug("****Going To Enter On Email Page****");
		logger.debug("");
		logger.debug("");
		ModelAndView model = new ModelAndView();
		model.setViewName("contactByEmail");
		return model;
	}
	
	@RequestMapping(value = "/sendEmailWithAttachment-account", method = RequestMethod.POST)
	public ModelAndView sendEmailThroughSpring(@RequestParam("from") String from, 
			@RequestParam("to") String to, @RequestParam("subject") String subject,
			@RequestParam("text") String text, 
			@RequestParam("pathForAttachment") String pathForAttachment) throws MessagingException {
		logger.debug("****Going To Start Send Email Through Spring Method****");
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		boolean multipart = true;
		FileSystemResource getFile = new FileSystemResource(new File(pathForAttachment));
		MimeMessageHelper mimeHelper = new MimeMessageHelper(mimeMessage, multipart);
		mimeHelper.setFrom(from);
		mimeHelper.setTo(to);
		mimeHelper.setSubject(subject);
		mimeHelper.setText(text);
		mimeHelper.addAttachment("Txt File", getFile);
		this.mailSender.send(mimeMessage);	
		ModelAndView model = new ModelAndView();
		model.addObject("result", "Email Sent Successfully....");
		model.setViewName("emailSuccess");
		logger.debug("Email Sent Successfully....");
		logger.debug("****Going To End Send Email Through Spring Method****");
		logger.debug("");
		logger.debug("");
		return model;
	}
}
