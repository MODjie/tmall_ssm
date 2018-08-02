package com.how2java.tmall.controller;

import com.how2java.tmall.pojo.Property;
import com.how2java.tmall.service.CategoryService;
import com.how2java.tmall.service.PropertysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PropertyController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	PropertysService propertysService;

//	public String insert(Property property){
//		propertysService.insert(property);
//		return
//	}
}
