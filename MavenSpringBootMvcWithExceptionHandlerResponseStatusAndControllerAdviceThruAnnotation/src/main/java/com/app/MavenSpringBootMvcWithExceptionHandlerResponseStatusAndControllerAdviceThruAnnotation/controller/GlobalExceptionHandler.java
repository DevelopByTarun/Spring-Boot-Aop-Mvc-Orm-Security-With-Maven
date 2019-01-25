package com.app.MavenSpringBootMvcWithExceptionHandlerResponseStatusAndControllerAdviceThruAnnotation.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import com.app.MavenSpringBootMvcWithExceptionHandlerResponseStatusAndControllerAdviceThruAnnotation.customexception.CustomGeneralException;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(CustomGeneralException.class)
	public ModelAndView handleCustomGeneralException() {
		ModelAndView model = new ModelAndView();
		// add needed model attributes
		model.setViewName("generalexception");
		return model;
	}

}