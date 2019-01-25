package com.app.MavenSpringBootMvcWithInternationalizationAndLocalizationThruAnnotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.MavenSpringBootMvcWithInternationalizationAndLocalizationThruAnnotation.dao.IUserDAO;
import com.app.MavenSpringBootMvcWithInternationalizationAndLocalizationThruAnnotation.model.User;

@Controller
public class UserController {
	
	@Autowired
	private IUserDAO userDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView callAddUser(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("age") int age, @RequestParam("city") String city,
			@ModelAttribute() User myUser) throws Exception {
		User user = null;
		myUser.setId(id);
		myUser.setName(name);
		myUser.setAge(age);
		myUser.setCity(city);
		try {
			user = userDAO.addUser(myUser);
		} catch(Exception e) {
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView();
		model.addObject("values", user);
		model.setViewName("userDetails");
		return model;
	}
}
