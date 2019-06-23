package com.usts.crm.service;

import java.util.List;

import com.usts.crm.pojo.BaseDict;

/**
 * 字典数据表业务逻辑接口
 */
public interface BaseDictService {
	
	/**
	 * 根据字典编码查询字典列表
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseDictByCode(String code);

}
