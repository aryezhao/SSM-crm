package com.usts.crm.service;


import org.springframework.stereotype.Service;

import com.usts.crm.pojo.Users;

/**
 * 用户信息业务逻辑接口
 */
@Service
public interface UserService {
	
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 */
	Users getUserById(Integer id);
	
}
