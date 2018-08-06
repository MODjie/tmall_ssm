package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Property;

import java.util.List;

public interface PropertysService {

	int deleteByPrimaryKey(Integer id);

	int insert(Property record);

	int insertSelective(Property record);

	Property selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Property record);

	int updateByPrimaryKey(Property record);

	List<Property> list(Integer cid);
}
