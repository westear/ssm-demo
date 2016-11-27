package com.westear.ssm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@SuppressWarnings("unused")
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	
	static {
		System.out.println("==============>in the controller(user)");
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.GET)
	public String addUser(Model model){
		System.out.println("in the Controller(user/addUser)");
		return "addUser";
	}
}
