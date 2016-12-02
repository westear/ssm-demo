package com.westear.ssm.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.westear.ssm.model.User;

public interface UserService {

	void addUser(User user);
	
	User getUserById(String Id);
	
	boolean login(HttpServletRequest req, HttpServletResponse resp,User user);
}
