package com.westear.ssm.service.common;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CountOnlineUserService {
	
	List<Map<String, Object>> getOnlineUserService(HttpServletRequest req, HttpServletResponse resp);
	
	int getOnlineUserAmount(HttpServletRequest req, HttpServletResponse resp);
}
