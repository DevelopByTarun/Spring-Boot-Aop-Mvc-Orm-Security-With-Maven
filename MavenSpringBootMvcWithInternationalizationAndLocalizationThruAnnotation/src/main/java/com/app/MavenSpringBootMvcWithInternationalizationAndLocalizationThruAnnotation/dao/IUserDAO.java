package com.app.MavenSpringBootMvcWithInternationalizationAndLocalizationThruAnnotation.dao;

import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootMvcWithInternationalizationAndLocalizationThruAnnotation.model.User;

@Repository
public interface IUserDAO {
	
	public User addUser(User user) throws Exception;
}
