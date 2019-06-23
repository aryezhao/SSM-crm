package com.usts.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.usts.crm.pojo.BaseDict;
import com.usts.crm.pojo.Customer;
import com.usts.crm.pojo.QueryVo;
import com.usts.crm.service.BaseDictService;
import com.usts.crm.service.CustomerService;
import com.usts.crm.service.UserService;
import com.usts.crm.utils.Page;

/**
 * 客户信息请求处理
 */
@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private BaseDictService dictService;
	
	@Autowired
	private CustomerService customerService;
	
	@Value("${customer_from_type}")
	private String customer_from_type;
	@Value("${customer_industry_type}")
	private String customer_industry_type;
	@Value("${customer_level_type}")
	private String customer_level_type;
	
	@RequestMapping("list")
	public String list(Model model,QueryVo vo){
		
		//查询来源	
		List<BaseDict> fromType = dictService.getBaseDictByCode(customer_from_type);
		//查询行业
		List<BaseDict> industryType = dictService.getBaseDictByCode(customer_industry_type);
		//查询级别
		List<BaseDict> levelType = dictService.getBaseDictByCode(customer_level_type);
		//设置数据模型的返回
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		//根据查询条件分页查询用户列表
		Page<Customer> page = customerService.getCustomerByQueryVo(vo);
		
		//设置分页数据返回
		model.addAttribute("page", page);
		
		return "customer";
	}
	
	@RequestMapping("edit")
	@ResponseBody
	public Customer edit(Integer id){
		Customer customer = customerService.getCustomerById(id);
		return customer;
	}
	
	@RequestMapping("update")
	@ResponseBody
	public String update(Customer customer){
		String msg = "1";
		try {
			customerService.updateCustomer(customer);
			msg = "0";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	
	@RequestMapping("delete")
	@ResponseBody
	public String delete(Integer id){
		String msg = "1";
		try {
			customerService.deleteCustomer(id);
			msg = "0";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	
	@RequestMapping("mytag")
	public String mytag(){
		return "mytag";
	}
	@RequestMapping("login")
	public String login(){
		return "login_test";
	}
	
/*	@RequestMapping("users")
	public String users(Integer id){
		UserService userService = new UserServiceImpl();
		Users users = userService.getUserById(id);
		
		System.out.println("用户名称："+users.getName());
		System.out.println("用户密码："+users.getPassword());
		return "user_test";
	}*/

}
