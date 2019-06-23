package com.usts.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usts.crm.mapper.CustomerMapper;
import com.usts.crm.pojo.Customer;
import com.usts.crm.pojo.QueryVo;
import com.usts.crm.service.CustomerService;
import com.usts.crm.utils.Page;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Page<Customer> getCustomerByQueryVo(QueryVo vo) {
		
		//计算分页查询从那条记录开始
		vo.setStart((vo.getPage() - 1) * vo.getRows());
		
		//查询总记录数
		Integer total = customerMapper.getCountByQueryVo(vo);
		
		//查询每页的数据列表
		List<Customer> list = customerMapper.getCustomerByQueryVo(vo);
		
		//包装分页数据
		Page<Customer> page = new Page<Customer>(total,vo.getPage(),vo.getRows(),list);
		
		return page;
	}

	@Override
	public Integer getCountByQueryVo(QueryVo vo) {
		return null;
	}

	@Override
	public Customer getCustomerById(Integer id) {
		return customerMapper.getCustomerById(id);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerMapper.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Integer id) {
		customerMapper.deleteCustomer(id);
	}

}
