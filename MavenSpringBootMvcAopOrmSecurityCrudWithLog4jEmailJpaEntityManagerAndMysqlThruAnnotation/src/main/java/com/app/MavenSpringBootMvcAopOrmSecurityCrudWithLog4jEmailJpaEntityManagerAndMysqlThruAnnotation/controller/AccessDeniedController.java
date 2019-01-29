package com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaEntityManagerAndMysqlThruAnnotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccessDeniedController {
	
	 @RequestMapping(value = "/accessdenied-account", method = RequestMethod.GET)
	 public String loginError(ModelMap model) {
		 model.addAttribute("error", "true");
		 return "accessdenied";
	 }
}
