package com.westear.ssm.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.westear.ssm.common.util.EncryptPsw;
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

	@Override
	public boolean login(HttpServletRequest req, HttpServletResponse resp,User user) {
		User u = this.UserMapper.selectUserByUsername(user.getUsername());
		if(EncryptPsw.encryptByMD(user.getPsw()).equals(u.getPsw())){
			req.getSession().setAttribute("loginUser", u);
			return true;
		}else{
			return false;
		}
	}

}