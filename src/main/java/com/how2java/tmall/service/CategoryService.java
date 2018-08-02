package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Category;

import java.util.List;
public interface CategoryService{
    List<Category> list();

    void insert(Category category);

    void deleteByPrimaryKey(int id);

    Category selectByPrimaryKey(int id);

    void updateByPrimaryKey(Category c);
}
