package com.westear.ssm.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.filter.OncePerRequestFilter;
/**
 * 登录验证过滤器，如果用户已登录，信息存于Session中
 * 继承org.springframework.web.filter.OncePerRequestFilter 在servlet3.0以上版本中，
 * Spring实现了多线程异步回调filter,并确保只执行一次请求
 * @author westear
 * @see #OncePerRequestFilter
 */
public class AccessFilter extends OncePerRequestFilter{
	
	private static final String noFilter = "/resources/";	//不用过滤的uri
	private static final String loginUrl ="/user/login";
	private boolean doFilter = true;
	private String uri = "";
	
	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
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
		if(uri.indexOf(req.getContextPath()+loginUrl) != -1){
			this.doFilter = false;
		}
		//如果过滤
		if(this.doFilter){
			if(session.getAttribute("loginUser") != null){
				req.getRequestDispatcher("/common/home").forward(req, resp);
				return;
			}else{
				if(uri.indexOf("/user/userLogin") != -1){
					req.getRequestDispatcher("/user/userLogin").forward(req, resp);
				}else{
					req.getRequestDispatcher("/user/login").forward(req, resp);
					return;
				}
			}
		}
		filterChain.doFilter(req, resp);
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
