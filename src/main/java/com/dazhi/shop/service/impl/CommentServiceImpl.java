package com.dazhi.shop.service.impl;

import com.dazhi.shop.entity.Comment;
import com.dazhi.shop.mapper.CommentMapper;
import com.dazhi.shop.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评论表 服务实现类
 * </p>
 *
 * @author dazhi
 * @since 2020-05-28
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
