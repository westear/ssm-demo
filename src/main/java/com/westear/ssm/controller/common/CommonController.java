package com.westear.ssm.controller.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/common")
public class CommonController {
	
	@SuppressWarnings("unused")
	private static Logger log = LoggerFactory.getLogger(CommonController.class);
	
	@RequestMapping(value="/home")
	public String home(HttpServletRequest req, HttpServletResponse resp, Model model){
		model.addAttribute("user", req.getSession().getAttribute("loginUser"));
		return "common/home";
	}
}
