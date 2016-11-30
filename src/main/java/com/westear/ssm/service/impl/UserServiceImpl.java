package com.westear.ssm.service.impl;

import javax.annotation.Resource;
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
	private UserMapper userMapper;
	
	@Override
	public void addUser(User user) {
		if(userMapper != null){
			userMapper.insert(user);
			System.out.println("=======>in addUser serviceImpl");
		}
	}

	@Override
	public User getUserById(String id) {
		System.out.println("=======>in getUserById serviceImpl");
		return this.userMapper.selectByPrimaryKey(id);
	}

}