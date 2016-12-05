package com.westear.ssm.listener;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 当session创建时监听，记录系统的在线人数
 * @author westear
 *
 */
public class UserOnlineListener implements HttpSessionAttributeListener {

	private static final String SESSION_NAME = "loginUser";
	
	@SuppressWarnings("unchecked")
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		if(SESSION_NAME.equals(event.getName())){
			Map<String, HttpSession> map = 
					(Map<String, HttpSession>) event.getSession().getServletContext()
					.getAttribute("onlineUsers");
			if(map == null){	//说明当前没有人访问，且session过期，需要手动创建
				//对集合上锁
				map = Collections.synchronizedMap(new HashMap<String, HttpSession>());
				event.getSession().getServletContext().setAttribute("onlineUsers", map);
			}
			///以session 的id为key,session对象为value存在map中
			map.put(event.getSession().getId(), event.getSession());
		}
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		
	}

	
}
