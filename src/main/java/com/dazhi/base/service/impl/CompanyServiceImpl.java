package com.dazhi.base.service.impl;

import com.dazhi.base.entity.Company;
import com.dazhi.base.mapper.CompanyMapper;
import com.dazhi.base.service.ICompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司表 服务实现类
 * </p>
 *
 * @author dazhi
 * @since 2020-05-25
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
