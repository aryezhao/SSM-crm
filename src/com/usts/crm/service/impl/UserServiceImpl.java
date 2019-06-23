package com.usts.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.usts.crm.mapper.UserMapper;
import com.usts.crm.pojo.Users;
import com.usts.crm.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public Users getUserById(Integer id) {
		Users users = userMapper.getUserById(id);
		String name = users.getName();
		String password = users.getPassword();
		System.out.println(name);
		System.out.println(password);
		return users;
	}

}
