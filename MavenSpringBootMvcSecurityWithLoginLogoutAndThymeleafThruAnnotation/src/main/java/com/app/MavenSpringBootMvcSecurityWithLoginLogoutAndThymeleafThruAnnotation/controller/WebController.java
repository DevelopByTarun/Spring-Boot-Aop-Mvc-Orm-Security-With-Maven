package com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndThymeleafThruAnnotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class WebController {
     
    @RequestMapping(value={"/","home"})
    public String home() {
    	return "home";
    }
    
    @RequestMapping(value ="/user", method = RequestMethod.GET)
    public String user(){
        return "user";
    }
 
    @RequestMapping(value ="/admin", method = RequestMethod.GET)
    public String admin(){
        return "admin";
    }
  
    @RequestMapping(value ="/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
  
    @RequestMapping(value ="/403", method = RequestMethod.GET)
    public String Error403(){
        return "403";
    }
}
