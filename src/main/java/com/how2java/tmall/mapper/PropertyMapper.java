package com.how2java.tmall.mapper;

import com.how2java.tmall.pojo.Property;

import java.util.List;

public interface PropertyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Property record);

    int insertSelective(Property record);

    Property selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKey(Property record);

    Property get();

    List<Property> list(Integer cid);
}