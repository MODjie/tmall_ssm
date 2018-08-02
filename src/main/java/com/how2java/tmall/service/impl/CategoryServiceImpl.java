package com.how2java.tmall.service.impl;

import com.how2java.tmall.mapper.CategoryMapper;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }

    @Override
    public void insert(Category category) {
         categoryMapper.insert(category);
    }

    @Override
    public void deleteByPrimaryKey(int id) {
        categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Category selectByPrimaryKey(int id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKey(Category c) {
        categoryMapper.updateByPrimaryKey(c);
    }
}
