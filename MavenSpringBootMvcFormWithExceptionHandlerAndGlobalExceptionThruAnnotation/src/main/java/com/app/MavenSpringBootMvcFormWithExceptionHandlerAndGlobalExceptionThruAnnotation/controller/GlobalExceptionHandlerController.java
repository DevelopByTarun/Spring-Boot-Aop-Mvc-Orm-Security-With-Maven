package com.app.MavenSpringBootMvcFormWithExceptionHandlerAndGlobalExceptionThruAnnotation.controller;

import java.io.IOException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandlerController {
	
	@ExceptionHandler(IOException.class)
	public ModelAndView myUsernameError(Exception ex) {
		System.out.println("=====Caught IOException=====");
		ModelAndView model = new ModelAndView();
		model.addObject("exception", ex);
		model.setViewName("globalException");
		return model;
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ModelAndView myPasswordError(Exception ex) {
		System.out.println("=====Caught NullPointerException=====");
		ModelAndView model = new ModelAndView();
		model.addObject("exception", ex);
		model.setViewName("globalException");
		return model;
	}

}
