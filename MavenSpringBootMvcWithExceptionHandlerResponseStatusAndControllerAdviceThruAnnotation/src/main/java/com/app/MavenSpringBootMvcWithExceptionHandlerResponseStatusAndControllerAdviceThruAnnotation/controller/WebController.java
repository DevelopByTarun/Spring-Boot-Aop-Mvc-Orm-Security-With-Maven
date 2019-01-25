package com.app.MavenSpringBootMvcWithExceptionHandlerResponseStatusAndControllerAdviceThruAnnotation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.app.MavenSpringBootMvcWithExceptionHandlerResponseStatusAndControllerAdviceThruAnnotation.customexception.CustomConflictException;
import com.app.MavenSpringBootMvcWithExceptionHandlerResponseStatusAndControllerAdviceThruAnnotation.customexception.CustomException;
import com.app.MavenSpringBootMvcWithExceptionHandlerResponseStatusAndControllerAdviceThruAnnotation.customexception.CustomExceptionWithHttpStatusCode;
import com.app.MavenSpringBootMvcWithExceptionHandlerResponseStatusAndControllerAdviceThruAnnotation.customexception.CustomGeneralException;

@Controller
public class WebController {
	
	@RequestMapping(value = "/")
	public String showWelcomePage() {
		return "index";
	}

	@RequestMapping(value = "/normalexception", method = RequestMethod.GET)
	public void throwException() {
		throw new RuntimeException();
	}

	@RequestMapping(value = "/customexception", method = RequestMethod.GET)
	public void throwCustomException() {
		throw new CustomException();
	}

	@RequestMapping(value = "/conflictexception", method = RequestMethod.GET)
	public void throwCustomConfictException() {
		throw new CustomConflictException();
	}

	@RequestMapping(value = "/customexceptionwithhttpstatuscode", method = RequestMethod.GET)
	public void throwCustomExceptionWithHttpStatusCode() {
		throw new CustomExceptionWithHttpStatusCode();
	}

	/*
	 * Use ExceptionHadler in AdviceWebController defined
	 * with @ControllerAdvice.
	 */
	@RequestMapping(value = "/customgeneralexception", method = RequestMethod.GET)
	public void throwCustomGeneralException() {
		throw new CustomGeneralException();
	}

	// Convert a predefined exception to an HTTP Status code
	@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Having conflict")
	@ExceptionHandler(CustomConflictException.class)
	public void conflict() {
		// log something
	}

	@ExceptionHandler(CustomException.class)
	public String runtimeException() {
		return "exception";
	}
}
