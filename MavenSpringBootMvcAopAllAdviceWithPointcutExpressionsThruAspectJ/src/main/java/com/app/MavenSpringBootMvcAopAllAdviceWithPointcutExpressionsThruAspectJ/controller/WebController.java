package com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ.service.CustomerAdvanceService;
import com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ.service.CustomerAnotherService;
import com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ.service.CustomerLoggableService;
import com.app.MavenSpringBootMvcAopAllAdviceWithPointcutExpressionsThruAspectJ.service.CustomerService;

@Controller
public class WebController {
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	CustomerService service = context.getBean(CustomerService.class);
	CustomerAnotherService anotherService = context.getBean(CustomerAnotherService.class);
	CustomerAdvanceService advanceService = context.getBean(CustomerAdvanceService.class);
	CustomerLoggableService loggableService = context.getBean(CustomerLoggableService.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage() {
		return "welcome";
	}
	
	@RequestMapping(value = "/aspectnormal", method = RequestMethod.GET)
    public ModelAndView normalAspect(){
    	String result1 = "";
    	result1 += service.getCustomerById(1).getFirstName() + "<br/>";
    	result1 += service.setCustomerFirstName("Peter", 1) + "<br/>";
    	result1 += service.setCustomerLastName("Levin", 2);
		ModelAndView model = new ModelAndView();
		model.addObject("getresult", result1);
		model.setViewName("aspect");
		return model;
    }
            
    @RequestMapping(value = "/aspectpointcut", method = RequestMethod.GET)
    public ModelAndView pointcutAspect(){
    	String result2 = "";
    	result2 += anotherService.findCustomerByLastName("Smith") + "<br/>";
    	result2 += anotherService.findAllCustomers();
    	ModelAndView model = new ModelAndView();
		model.addObject("getresult", result2);
		model.setViewName("aspect");
		return model;
    }
    
    @RequestMapping(value = "/aspectjoinpoint", method = RequestMethod.GET)
    public ModelAndView joinpointAspect(){
    	String result3 = "";
    	result3 += advanceService.setCustomerFirstName("Peter", 1) + "<br/>";
    	result3 += advanceService.findAllCustomers();
    	ModelAndView model = new ModelAndView();
		model.addObject("getresult", result3);
		model.setViewName("aspect");
		return model;
    }
    
    @RequestMapping(value = "/aspectloggable", method = RequestMethod.GET)
    public ModelAndView loggableAspect(){   	
    	ModelAndView model = new ModelAndView();
		model.addObject("getresult", loggableService.getCustomerById(1).getFirstName());
		model.setViewName("aspect");
		return model;
    }
}
