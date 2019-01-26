package com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ExecuteTimeInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		long startTime = System.currentTimeMillis();
		System.out.println("This Is PreHandle Method Of ExecuteTimeInterceptor Is Called");
		System.out.println("Request Url Is :: "+request.getRequestURL());
		System.out.println("Start Time Is :: "+System.currentTimeMillis());
		request.setAttribute("StartTime", startTime);
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView model) throws Exception {
		System.out.println("This Is PostHandle Method Of ExecuteTimeInterceptor Is Called");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		long startTime = (long) request.getAttribute("StartTime");
		long endTime = System.currentTimeMillis();
		System.out.println("This Is AfterCompletion Method Of ExecuteTimeInterceptor Is Called");
		System.out.println("End Time Is :: "+endTime);
		System.out.println("Total Time Taken Is :: "+(endTime - startTime));
	}
}
