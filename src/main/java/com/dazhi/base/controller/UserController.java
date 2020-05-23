package com.dazhi.base.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.dazhi.base.entity.User;
import com.dazhi.base.service.IUserService;
import com.dazhi.common.BaseController;

import io.swagger.annotations.Api;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author dazhi
 * @since 2020-05-21
 */
@RestController
@RequestMapping("/base/user")
@Api(value = "/base/user", tags = "UserController", description = "用户管理接口")
public class UserController extends BaseController<User> {
	@Autowired
	public void setIService(IUserService userService) {
		super.setiService(userService);
	}
	
}
