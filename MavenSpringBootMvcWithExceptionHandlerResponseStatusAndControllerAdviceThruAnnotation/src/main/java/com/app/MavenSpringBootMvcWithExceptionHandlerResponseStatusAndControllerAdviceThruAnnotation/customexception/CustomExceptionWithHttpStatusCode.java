package com.app.MavenSpringBootMvcWithExceptionHandlerResponseStatusAndControllerAdviceThruAnnotation.customexception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Not Found Exception!")
public class CustomExceptionWithHttpStatusCode extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}