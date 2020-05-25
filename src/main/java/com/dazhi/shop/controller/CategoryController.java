package com.dazhi.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dazhi.common.BaseController;
import com.dazhi.shop.entity.Category;
import com.dazhi.shop.service.ICategoryService;

import io.swagger.annotations.Api;

/**
 * <p>
 * 无限级商品分类表 前端控制器
 * </p>
 *
 * @author dazhi
 * @since 2020-05-25
 */
@RestController
@RequestMapping("/shop/category")
@Api(value = "/shop/category", tags = "CategoryController", description = "商品分类管理接口")
public class CategoryController extends BaseController<Category> {
	@Autowired
	public void setIService(ICategoryService categoryService) {
		super.setiService(categoryService);
	}
}
