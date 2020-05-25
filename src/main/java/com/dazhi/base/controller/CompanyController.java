package com.dazhi.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dazhi.base.entity.Company;
import com.dazhi.base.service.ICompanyService;
import com.dazhi.common.BaseController;

import io.swagger.annotations.Api;

/**
 * <p>
 * 公司表 前端控制器
 * </p>
 *
 * @author dazhi
 * @since 2020-05-25
 */
@RestController
@RequestMapping("/base/company")
@Api(value = "/base/company", tags = "CompanyController", description = "公司管理接口")
public class CompanyController extends BaseController<Company> {
	@Autowired
	public void setIService(ICompanyService companyService) {
		super.setiService(companyService);
	}
}
