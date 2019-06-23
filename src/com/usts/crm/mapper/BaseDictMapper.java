package com.usts.crm.mapper;

import java.util.List;

import com.usts.crm.pojo.BaseDict;

/**
 * 字典数据表持久化接口
 */
public interface BaseDictMapper {
	
	/**
	 * 根据字典编码查询字典列表
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseDictByCode(String code);

}
