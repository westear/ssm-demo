package com.westear.ssm.service.impl.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.westear.ssm.service.common.CountOnlineUserService;

@Service
public class CountOnlineUserServiceImpl implements CountOnlineUserService{

	/**
	 * 展示登录用户信息
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Map<String, Object>> getOnlineUserService(HttpServletRequest req,
			HttpServletResponse resp) {
		//将session信息封装成list,便于展示
		List<Map<String, Object>> sessionList = new ArrayList<Map<String, Object>>();
		Map<String, HttpSession> onlineUsers = 
				(Map<String, HttpSession>) req.getSession().getServletContext()
				.getAttribute("onlineUsers");
		Iterator<Map.Entry<String, HttpSession>> it = onlineUsers.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, HttpSession> entry = it.next();
			//得到单个session
			HttpSession sessionItem = entry.getValue();
			//构造展示数据
			Map<String, Object> mm = new HashMap<String, Object>();
			mm.put("id", sessionItem.getId());
			mm.put("createTime", new Date(sessionItem.getCreationTime()));
			mm.put("lastAccessTime", new Date(sessionItem.getLastAccessedTime()));
			mm.put("user", sessionItem.getAttribute("loginUser"));
			mm.put("ip", sessionItem.getAttribute("ip"));
			sessionList.add(mm);
		}
		return sessionList;
	}

	/**
	 * 获得当前登录在线人数
	 */
	@SuppressWarnings("unchecked")
	@Override
	public int getOnlineUserAmount(HttpServletRequest req,
			HttpServletResponse resp) {
		Map<String, HttpSession> onlineUsers = 
				(Map<String, HttpSession>) req.getSession().getServletContext()
				.getAttribute("onlineUsers");
		if(onlineUsers != null){
			return onlineUsers.size();
		}else{
			return 0;
		}
	}
}
