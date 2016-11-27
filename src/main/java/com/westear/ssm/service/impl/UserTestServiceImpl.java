package com.westear.ssm.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.westear.ssm.model.UserTest;
import com.westear.ssm.service.UserTestService;

@Service
@Transactional
public class UserTestServiceImpl implements UserTestService {

	@Override
	public UserTest saveUser(UserTest userTest) {
		return null;
	}

}
