package com.usts.crm.service;

import java.util.List;

import com.usts.crm.pojo.Customer;
import com.usts.crm.pojo.QueryVo;
import com.usts.crm.utils.Page;

/**
 * 客户信息业务逻辑接口
 */
public interface CustomerService {

	/**
	 * 根据查询条件，分页查询用户列表
	 * @param vo
	 * @return
	 */
	Page<Customer> getCustomerByQueryVo(QueryVo vo);
	
	/**
	 * 根据查询条件  查询总记录数
	 * @param vo
	 * @return
	 */
	Integer getCountByQueryVo(QueryVo vo);
	
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 */
	Customer getCustomerById(Integer id);
	
	/**
	 * 更新用户信息
	 * @param customer
	 */
	void updateCustomer(Customer customer);
	
	/**
	 * 删除用户信息
	 * @param id
	 */
	void deleteCustomer(Integer id);
}
