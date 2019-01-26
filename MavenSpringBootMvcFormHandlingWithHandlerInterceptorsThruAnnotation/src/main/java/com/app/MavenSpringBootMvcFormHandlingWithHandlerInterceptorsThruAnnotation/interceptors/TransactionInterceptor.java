package com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TransactionInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
		System.out.println("This Is PreHandle Method Of TransactionInterceptor Is Called");
		System.out.println("Got Request To Add Student : Name :: "+request.getParameter("name"));
		return true;
	}
}
