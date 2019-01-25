package com.app.MavenSpringBootMvcWithInternationalizationAndLocalizationThruAnnotation.service;

import org.springframework.stereotype.Service;
import com.app.MavenSpringBootMvcWithInternationalizationAndLocalizationThruAnnotation.dao.IUserDAO;
import com.app.MavenSpringBootMvcWithInternationalizationAndLocalizationThruAnnotation.model.User;

@Service
public class UserService implements IUserDAO {

	@Override
	public User addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		User use = new User();
		use.setId(user.getId());
		use.setName(user.getName());
		use.setAge(user.getAge());
		use.setCity(user.getCity());
		return use;
	}
}
