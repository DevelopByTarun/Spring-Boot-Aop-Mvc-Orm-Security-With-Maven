package com.app.MavenSpringBootMvcWithBeanInheritance.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.app.MavenSpringBootMvcWithBeanInheritance.service.CustomerService;
import com.app.MavenSpringBootMvcWithBeanInheritance.service.SpecificService;

@Controller
public class WebController {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	CustomerService service = (CustomerService) context.getBean("customerService");
	CustomerService anotherService = (CustomerService) context.getBean("anotherCustomerService");
	SpecificService telephoneService = (SpecificService) context.getBean("telephoneService");
	SpecificService consulteService = (SpecificService) context.getBean("consultationService");
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage() {
		return "welcome";
	}

	@RequestMapping(value = "/service", method = RequestMethod.GET)
	public ModelAndView generalService() {
		ModelAndView model = new ModelAndView();
		model.addObject("getservice", service.sayHello());
		model.setViewName("result");
		return model;
	}
	
	@RequestMapping(value = "/anotherservice", method = RequestMethod.GET)
	public ModelAndView anotherService() {
		ModelAndView model = new ModelAndView();
		model.addObject("getservice", anotherService.sayHello());
		model.setViewName("result");
		return model;
	}
	
	@RequestMapping(value = "/telephoneservice", method = RequestMethod.GET)
	public ModelAndView telephoneService() {
		ModelAndView model = new ModelAndView();
		model.addObject("getservice", telephoneService.sayHello());
		model.setViewName("result");
		return model;
	}
	
	@RequestMapping(value = "/consultservice", method = RequestMethod.GET)
	public ModelAndView consultationService() {
		ModelAndView model = new ModelAndView();
		model.addObject("getservice", consulteService.sayWelcome());
		model.setViewName("result");
		return model;
	}
}
