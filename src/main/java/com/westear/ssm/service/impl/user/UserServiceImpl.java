package com.westear.ssm.service.impl.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.westear.ssm.common.util.EncryptPsw;
import com.westear.ssm.dao.user.UserMapper;
import com.westear.ssm.model.user.User;
import com.westear.ssm.service.user.UserService;

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

	@Override
	public User login(HttpServletRequest req, HttpServletResponse resp,User user) {
		if(user.getUsername() != null && !"".equals(user.getUsername()) && user.getPsw() != null && !"".equals(user.getPsw())){
			User u = this.userMapper.selectUserByUsername(user.getUsername());
			if(u != null){
				if(EncryptPsw.encryptByMD(user.getPsw()).equals(u.getPsw())){
					req.getSession().setAttribute("loginUser", u);
					req.getSession().setAttribute("ip", req.getLocalAddr());
					return u;
				}
			}
		}
		return null;
	}

}