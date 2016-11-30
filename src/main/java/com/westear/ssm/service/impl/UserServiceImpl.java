package com.westear.ssm.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.westear.ssm.dao.UserMapper;
import com.westear.ssm.model.User;
import com.westear.ssm.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper UserMapper;
	
	@Override
	public void addUser(User user) {
		if(UserMapper != null){
			UserMapper.insert(user);
			System.out.println("=======>in addUser serviceImpl");
		}
	}

	@Override
	public User getUserById(String id) {
		System.out.println("=======>in getUserById serviceImpl");
		return this.UserMapper.selectByPrimaryKey(id);
	}

}