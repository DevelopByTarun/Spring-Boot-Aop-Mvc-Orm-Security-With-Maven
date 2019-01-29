package com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoTemplateAndMongodbThruAnnotation.config;

import com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoTemplateAndMongodbThruAnnotation.interceptors.LoggerInterceptor;
import com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoTemplateAndMongodbThruAnnotation.interceptors.LoginInterceptor;
import com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoTemplateAndMongodbThruAnnotation.interceptors.SessionTimerInterceptor;
import com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoTemplateAndMongodbThruAnnotation.interceptors.UserInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy
@PropertySource("classpath:log4j.properties")
@ComponentScan(basePackages = "MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoTemplateAndMongodbThruAnnotation")
public class CustomerAccountWebConfig extends WebMvcConfigurerAdapter {
	
	@Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**")
		.addResourceLocations("/static/");
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	    // mvc interceptors
		registry.addInterceptor(new LoginInterceptor());
	    registry.addInterceptor(new LoggerInterceptor());
	    registry.addInterceptor(new UserInterceptor());
	    registry.addInterceptor(new SessionTimerInterceptor());
	}
}
