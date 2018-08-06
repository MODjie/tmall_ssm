package com.how2java.tmall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.Property;
import com.how2java.tmall.service.CategoryService;
import com.how2java.tmall.service.PropertysService;
import com.how2java.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class PropertyController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	PropertysService propertysService;

	@RequestMapping("admin_property_add")
	public String add(Property property){
		propertysService.insert(property);
		return "redirect:admin_property_list?cid="+property.getCid();
	}

	@RequestMapping("admin_property_list")
	public String list(Integer cid, Model model,  Page page) {
		Category c = categoryService.selectByPrimaryKey(cid);

		PageHelper.offsetPage(page.getStart(),page.getCount());
		List<Property> ps = propertysService.list(cid);

		int total = (int) new PageInfo<>(ps).getTotal();
		page.setTotal(total);
		page.setParam("&cid="+c.getId());

		model.addAttribute("ps", ps);
		model.addAttribute("c", c);
		model.addAttribute("page", page);

		return "admin/listProperty";
	}

	@RequestMapping("admin_property_edit")
	public String edit(Model model, int id) {
		Property p = propertysService.selectByPrimaryKey(id);
		Category c = categoryService.selectByPrimaryKey(p.getCid());
		p.setCategory(c);
		model.addAttribute("p", p);
		return "admin/editProperty";
	}

	@RequestMapping("admin_property_update")
	public String update(Property p) {
		propertysService.updateByPrimaryKey(p);
		return "redirect:admin_property_list?cid="+p.getCid();
	}

	@RequestMapping("admin_property_delete")
	public String delete(int id) {
		Property p = propertysService.selectByPrimaryKey(id);
		propertysService.deleteByPrimaryKey(id);
		return "redirect:admin_property_list?cid="+p.getCid();
	}
}
