package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Property;

public interface PropertysService {

	int insert(Property record);

	int insertSelective(Property record);

	Property selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Property record);

	int updateByPrimaryKey(Property record);
}
