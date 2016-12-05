package com.westear.ssm.controller.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.westear.ssm.service.common.CountOnlineUserService;

@Controller
@RequestMapping("/common")
public class CommonController {
	
	@SuppressWarnings("unused")
	private static Logger log = LoggerFactory.getLogger(CommonController.class);
	
	@Autowired
	private CountOnlineUserService countOnlineUserService;
	
	@RequestMapping(value="/home")
	public String home(HttpServletRequest req, HttpServletResponse resp, Model model){
		if(req.getSession().getAttribute("loginUser") != null){
			model.addAttribute("user", req.getSession().getAttribute("loginUser"));
		}
		//获得当前在线人数
		int onlineAmount = this.countOnlineUserService.getOnlineUserAmount(req, resp);
		model.addAttribute("onlineAmount",onlineAmount);
		return "common/home";
	}
}
