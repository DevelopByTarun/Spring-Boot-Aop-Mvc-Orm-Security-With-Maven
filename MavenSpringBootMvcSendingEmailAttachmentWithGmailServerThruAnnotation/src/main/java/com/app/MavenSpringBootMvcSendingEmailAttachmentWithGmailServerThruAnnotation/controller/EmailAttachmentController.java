package com.app.MavenSpringBootMvcSendingEmailAttachmentWithGmailServerThruAnnotation.controller;

import java.io.File;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
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
public class EmailAttachmentController {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@RequestMapping(value = "/sendEmailWithAttachment", method = RequestMethod.POST)
	public ModelAndView sendEmailThroughSpring(@RequestParam("from") String from, 
			@RequestParam("to") String to, @RequestParam("subject") String subject,
			@RequestParam("text") String text, 
			@RequestParam("pathForAttachment") String pathForAttachment) throws MessagingException {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		boolean multipart = true;
		FileSystemResource getFile = new FileSystemResource(new File(pathForAttachment));
		MimeMessageHelper mimeHelper = new MimeMessageHelper(mimeMessage, multipart);
		mimeHelper.setFrom(from);
		mimeHelper.setTo(to);
		mimeHelper.setSubject(subject);
		mimeHelper.setText(text);
		mimeHelper.addAttachment("Pdf File", getFile);
		this.mailSender.send(mimeMessage);	
		ModelAndView model = new ModelAndView();
		model.addObject("result", "Email Sent Successfully....");
		model.setViewName("success");
		return model;
	}
	
//	String pathForAttachment = "/JavaFrameworks/SpringNotes.pdf";
}
