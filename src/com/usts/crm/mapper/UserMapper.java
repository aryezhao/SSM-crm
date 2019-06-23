package com.usts.crm.mapper;


import com.usts.crm.pojo.Users;

/**
 * 用户信息持久化接口
 */
public interface UserMapper {
	
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 */
	Users getUserById(Integer id);
	
}
