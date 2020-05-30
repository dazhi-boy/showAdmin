package com.dazhi.base.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dazhi.base.entity.Consumer;
import com.dazhi.base.service.IConsumerService;
import com.dazhi.base.service.IUserService;
import com.dazhi.common.BaseController;

import io.swagger.annotations.Api;

/**
 * <p>
 * 客户表 前端控制器
 * </p>
 *
 * @author dazhi
 * @since 2020-05-28
 */
@RestController
@RequestMapping("/base/consumer")
@Api(value = "/base/consumer", tags = "ConsumerController", description = "客户管理接口")
public class ConsumerController extends BaseController<Consumer> {
	@Autowired
	public void setIService(IConsumerService consumerService) {
		super.setiService(consumerService);
	}
}
