package com.app.MavenSpringBootMvcWithRequestSessionAndApplicationScopeThruAnnotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.app.MavenSpringBootMvcWithRequestSessionAndApplicationScopeThruAnnotation.bean.Customer;

@Controller
public class WebController {

	@Autowired
	private Customer customer;
	
	@RequestMapping(value = "/")
	public String showWelcomePage() {
		return "index";
	}

	@RequestMapping(value = "/address", method = RequestMethod.GET)
	public ModelAndView address() {
		String result = customer.getAddress();
		customer.setAddress("EU");
		ModelAndView model = new ModelAndView();
		model.addObject("getValue", "init Data: " + result + "|-----| modified Data: " + customer.getAddress());
		model.setViewName("scope");
		return model;
	}

	@RequestMapping(value = "/addresscheck", method = RequestMethod.GET)
	public ModelAndView addresscheck() {
		ModelAndView model = new ModelAndView();
		model.addObject("getValue", "check Data: " + customer.getAddress());
		model.setViewName("scope");
		return model;
	}

	@RequestMapping(value = "/age", method = RequestMethod.GET)
	public ModelAndView age() {
		String result = customer.getAge();
		customer.setAge("25");
		ModelAndView model = new ModelAndView();
		model.addObject("getValue", "init Data: " + result + "|-----| modified Data: " + customer.getAge());
		model.setViewName("scope");
		return model;
	}

	@RequestMapping(value = "/agecheck", method = RequestMethod.GET)
	public ModelAndView agecheck() {
		ModelAndView model = new ModelAndView();
		model.addObject("getValue", "check Data: " + customer.getAge());
		model.setViewName("scope");
		return model;
	}
}
