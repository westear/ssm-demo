package com.westear.ssm.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AccessFilter implements Filter{

	private boolean logined = false;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		//HttpServletRequest,HttpServletResponse both extends ServletRequest,ServletResponse;
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		if(session.getAttribute("loginUser") != null 
				&& !"".equals(session.getAttribute("loginUser"))){
			this.logined = true;
			chain.doFilter(req, resp);
		}
		if(!this.logined){
			//
			req.getRequestDispatcher("/user/login").forward(req, resp);
			return;
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
