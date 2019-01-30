package com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation.interceptors.LoggerInterceptor;
import com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation.interceptors.LoginInterceptor;
import com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation.interceptors.SessionTimerInterceptor;
import com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation.interceptors.UserInterceptor;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy
@EnableMongoRepositories("com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation.repository")
@PropertySource("classpath:log4j.properties")
@ComponentScan(basePackages = "com.app.MavenSpringBootMvcAopSecurityCrudWithLog4jEmailMongoRepositoryAndMongodbThruAnnotation")
public class WebConfig extends WebMvcConfigurerAdapter {
	
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
