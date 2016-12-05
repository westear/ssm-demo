package com.westear.ssm.test.mybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.westear.ssm.model.user.User;
import com.westear.ssm.service.user.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:configs/mybatis/spring-mybatis.xml"})
public class TestMybatis {

	private static Logger logger = Logger.getLogger(TestMybatis.class);
	
	@Resource
	private UserService userService;
	
	@Test
	public void getUserByIdTest(){
		User user = userService.getUserById("111111");
		logger.info(JSON.toJSONString(user));
	}
}
