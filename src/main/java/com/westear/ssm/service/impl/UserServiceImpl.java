package com.westear.ssm.service.impl;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.westear.ssm.dao.UserMapper;
import com.westear.ssm.model.User;
import com.westear.ssm.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

//	@Autowired
//	private UserMapper UserMapper;
	
	@Override
	public void addUser(User user) {
//		UserMapper.insert(user);
		System.out.println("=======>in addUser serviceImpl");
	}

}
