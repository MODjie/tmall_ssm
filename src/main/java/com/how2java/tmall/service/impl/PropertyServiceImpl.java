package com.how2java.tmall.service.impl;

import com.how2java.tmall.mapper.PropertyMapper;
import com.how2java.tmall.pojo.Property;
import com.how2java.tmall.service.PropertysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertysService{

	@Autowired
	PropertyMapper propertyMapper;

	@Override
	public int insert(Property record) {
		return propertyMapper.insert(record);
	}

	@Override
	public int insertSelective(Property record) {
		return propertyMapper.insertSelective(record);
	}

	@Override
	public Property selectByPrimaryKey(Integer id) {
		return propertyMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Property record) {
		return propertyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Property record) {
		return propertyMapper.updateByPrimaryKey(record);
	}
}
