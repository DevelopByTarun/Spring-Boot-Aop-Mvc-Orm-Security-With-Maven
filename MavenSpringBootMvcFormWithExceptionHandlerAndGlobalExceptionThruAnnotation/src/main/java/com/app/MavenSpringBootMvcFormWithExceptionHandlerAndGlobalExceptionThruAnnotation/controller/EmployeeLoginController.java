package com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation.dao.IEmployeeDAO;
import com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation.model.EmployeeLogin;

@Controller
public class EmployeeLoginController {
	
	@Autowired
	private IEmployeeDAO iemployee;
	
	@RequestMapping(value = "/")
	public String showWelcomePage() {
		return "index";
	}
		
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ModelAndView getAuthenticate(@RequestParam("usrnm") String username,
			@RequestParam("pwd") String password, @ModelAttribute() EmployeeLogin empLog) throws IOException {
		EmployeeLogin employeeLogin = null;
		ModelAndView model = new ModelAndView();
		if(username.length() > 6) {
			throw new IOException("Throw IOException The Length Of Username Is Not Correct !! Try Again..");
		}
		else {
			empLog.setUsername(username);
		}
		if(password.length() <= 6) {
			throw new NullPointerException("Throw NullPointerException The Length Of Password Is Not Correct !! Try Again..");
		}
		else {
			empLog.setPassword(password);
		}
		employeeLogin = iemployee.authenticateEmployee(empLog);
		model.addObject("values", employeeLogin);
		model.setViewName("welcome");
		return model;
	}
}
