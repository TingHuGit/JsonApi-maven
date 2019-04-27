package org.tinghu.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinghu.business.dao.UserMapper;
import org.tinghu.business.entity.User;
import org.tinghu.business.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserService(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
}
