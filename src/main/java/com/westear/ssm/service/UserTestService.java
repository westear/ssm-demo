package com.westear.ssm.service;

import com.westear.ssm.model.UserTest;

public interface UserTestService {
	
	/**
	 * 增加用户
	 * @param userTest	用户实体类
	 * @return	用户实体
	 */
	public UserTest saveUser(UserTest userTest);
}
