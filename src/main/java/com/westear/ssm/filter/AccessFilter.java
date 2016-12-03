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
	
	private static final String noFilter = "/resources/";	//不用过滤的uri
	private boolean doFilter = true;
	private String uri = "";
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		this.doFilter = true;
		//HttpServletRequest,HttpServletResponse both extends ServletRequest,ServletResponse;
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		//获得当前访问的uri
		uri = req.getRequestURI();
		//不用过滤的uri类型
		if(uri.indexOf(req.getContextPath()+noFilter) != -1){
			this.doFilter = false;
		}
		//如果过滤
		if(this.doFilter){
			if(session.getAttribute("loginUser") != null 
					&& !"".equals(session.getAttribute("loginUser"))){
				req.getRequestDispatcher("/common/home").forward(req, resp);
				chain.doFilter(req, resp);
			}else{
				if(uri.indexOf("/user/userLogin") != -1){
					req.getRequestDispatcher("/user/userLogin").forward(req, resp);
				}else{
					req.getRequestDispatcher("/user/login").forward(req, resp);
				}
				chain.doFilter(req, resp);
			}
		}else{	//如果不过滤
			chain.doFilter(req, resp);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
