package com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.dao.IStudentDAO;
import com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.model.StudentLogin;

@Controller
public class StudentLoginController {
	
	@Autowired
	private IStudentDAO istudent;
	
	@RequestMapping(value = "/")
	public String showWelcomePage() {
		return "index";
	}
		
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ModelAndView getAuthenticate(@RequestParam("usrnm") String username,
			@RequestParam("pwd") String password, @ModelAttribute() StudentLogin studentLog) throws IOException {
		StudentLogin studentLogin = null;
		ModelAndView model = new ModelAndView();
		studentLog.setUsername(username);
		studentLog.setPassword(password);
		try {
			studentLogin = istudent.authenticateStudent(studentLog);
		} catch(Exception e) {
			e.printStackTrace();
		}
		model.addObject("values", studentLogin);
		model.setViewName("welcome");
		return model;
	}
}
