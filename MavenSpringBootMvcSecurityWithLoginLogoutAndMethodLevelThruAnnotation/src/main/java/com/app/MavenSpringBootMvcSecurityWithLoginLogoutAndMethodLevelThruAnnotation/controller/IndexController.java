package com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndMethodLevelThruAnnotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/")
	public String openWelcomePage() {
		return "index";
	}
}
