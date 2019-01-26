package com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.dao.IStudentDAO;
import com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private IStudentDAO istudent;
	
	@RequestMapping(value = "/add/student", method = RequestMethod.POST)
	public ModelAndView getEmployeeDetails(@RequestParam("id") int id,
			@RequestParam(value = "name") String name, @RequestParam("age") int age,
			@RequestParam("city") String city, @ModelAttribute() Student student) {
		System.out.println("Student Saved, Name :: "+name);
		Student studs = null;
		ModelAndView model = new ModelAndView();
		student.setId(id);
		student.setName(name);
		student.setAge(age);
		student.setCity(city);
		try {
			studs = istudent.addStudentDetails(student);
		} catch(Exception e) {
			e.printStackTrace();
		}
		model.addObject("details", studs);
		model.setViewName("studentDetail");
		return model;	
	}	
}
