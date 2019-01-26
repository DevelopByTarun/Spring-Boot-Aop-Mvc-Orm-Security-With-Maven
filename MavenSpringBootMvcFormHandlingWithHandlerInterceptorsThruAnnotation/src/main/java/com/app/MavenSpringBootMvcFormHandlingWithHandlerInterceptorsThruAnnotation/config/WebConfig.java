package com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.interceptors.ExecuteTimeInterceptor;
import com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation.interceptors.TransactionInterceptor;

@SuppressWarnings("deprecation")
@Configuration
@ComponentScan(basePackages = "com.app.MavenSpringBootMvcFormHandlingWithHandlerInterceptorsThruAnnotation")
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	    registry.addInterceptor(new ExecuteTimeInterceptor());
	    registry.addInterceptor(new TransactionInterceptor()).addPathPatterns("/student/add/*");
	}	
}
