package com.dazhi.shop.service.impl;

import com.dazhi.shop.entity.Category;
import com.dazhi.shop.mapper.CategoryMapper;
import com.dazhi.shop.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 无限级商品分类表 服务实现类
 * </p>
 *
 * @author dazhi
 * @since 2020-05-25
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
