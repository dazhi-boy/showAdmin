package com.dazhi.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dazhi.base.service.IUserService;
import com.dazhi.common.BaseController;
import com.dazhi.shop.entity.Comment;
import com.dazhi.shop.service.ICommentService;

import io.swagger.annotations.Api;

/**
 * <p>
 * 商品评论表 前端控制器
 * </p>
 *
 * @author dazhi
 * @since 2020-05-28
 */
@RestController
@RequestMapping("/shop/comment")
@Api(value = "/shop/comment", tags = "CommentController", description = "商品评论管理接口")
public class CommentController extends BaseController<Comment> {
	@Autowired
	public void setIService(ICommentService commentService) {
		super.setiService(commentService);
	}
}
