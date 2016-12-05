package com.westear.ssm.dao.user;

import com.westear.ssm.model.user.User;

public interface UserMapper {
	int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectUserByUsername(String username);
}