package com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndThymeleafThruAnnotation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
 
@Configuration
@EnableWebSecurity 
@ComponentScan(basePackages = "com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndThymeleafThruAnnotation")
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@SuppressWarnings("deprecation")
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
         .inMemoryAuthentication().passwordEncoder(org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance())
          .withUser("user").password("user").roles("USER")
 .and()
         .withUser("admin").password("admin").roles("ADMIN");
    }
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
          .authorizeRequests()
          .antMatchers("/","/home").permitAll()
          .antMatchers("/admin").hasRole("ADMIN")
          .anyRequest().authenticated()
          .and()
          .formLogin()
          .loginPage("/login")
          .permitAll()
          .and()
          .logout()
          .permitAll();
        http.exceptionHandling().accessDeniedPage("/403");
    }
}
