package com.westear.ssm.service.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.westear.ssm.model.user.User;

public interface UserService {

	void addUser(User user);
	
	User getUserById(String Id);
	
	User login(HttpServletRequest req, HttpServletResponse resp,User user);
}
