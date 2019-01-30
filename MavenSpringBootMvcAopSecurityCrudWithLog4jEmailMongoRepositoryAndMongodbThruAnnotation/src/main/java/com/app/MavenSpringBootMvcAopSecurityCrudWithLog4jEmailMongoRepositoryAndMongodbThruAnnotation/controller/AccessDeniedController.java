package com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccessDeniedController {
	
	 @RequestMapping(value = "/accessdenied-company", method = RequestMethod.GET)
	 public String loginError(ModelMap model) {
		 model.addAttribute("error", "true");
		 return "accessdenied";
	 }
}
