package com.dazhi.shop.entity;

import com.dazhi.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品评论表
 * </p>
 *
 * @author dazhi
 * @since 2020-05-28
 */
@TableName("shop_comment")
@ApiModel(value="Comment对象", description="商品评论表")
public class Comment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "评论人Id")
    private Long consumerId;

    @ApiModelProperty(value = "评论人名称")
    private String consumerName;

    @ApiModelProperty(value = "评论的商品id")
    private Long productId;

    @ApiModelProperty(value = "评论的商品标题")
    private String productTitle;

    @ApiModelProperty(value = "父评论id")
    private Long parentCommentId;

    @ApiModelProperty(value = "父评论的用户id")
    private Long parentCommentConsumerId;

    @ApiModelProperty(value = "被回复的评论id")
    private Long replyCommentId;

    @ApiModelProperty(value = "被回复的评论用户id")
    private Long replyCommentConsumerId;

    @ApiModelProperty(value = "评论等级[ 1 一级评论 默认 ，2 二级评论]")
    private Long commentLevel;

    @ApiModelProperty(value = "评论的内容")
    private String content;

    @ApiModelProperty(value = "点赞数")
    private Long praiseNum;

    @ApiModelProperty(value = "置顶状态[ 1 置顶，0 不置顶 默认 ]")
    private Long topStatus;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createtime;

    public Long getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }
    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }
    public Long getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }
    public Long getParentCommentConsumerId() {
        return parentCommentConsumerId;
    }

    public void setParentCommentConsumerId(Long parentCommentConsumerId) {
        this.parentCommentConsumerId = parentCommentConsumerId;
    }
    public Long getReplyCommentId() {
        return replyCommentId;
    }

    public void setReplyCommentId(Long replyCommentId) {
        this.replyCommentId = replyCommentId;
    }
    public Long getReplyCommentConsumerId() {
        return replyCommentConsumerId;
    }

    public void setReplyCommentConsumerId(Long replyCommentConsumerId) {
        this.replyCommentConsumerId = replyCommentConsumerId;
    }
    public Long getCommentLevel() {
        return commentLevel;
    }

    public void setCommentLevel(Long commentLevel) {
        this.commentLevel = commentLevel;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public Long getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(Long praiseNum) {
        this.praiseNum = praiseNum;
    }
    public Long getTopStatus() {
        return topStatus;
    }

    public void setTopStatus(Long topStatus) {
        this.topStatus = topStatus;
    }
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Comment{" +
            "consumerId=" + consumerId +
            ", consumerName=" + consumerName +
            ", productId=" + productId +
            ", productTitle=" + productTitle +
            ", parentCommentId=" + parentCommentId +
            ", parentCommentConsumerId=" + parentCommentConsumerId +
            ", replyCommentId=" + replyCommentId +
            ", replyCommentConsumerId=" + replyCommentConsumerId +
            ", commentLevel=" + commentLevel +
            ", content=" + content +
            ", praiseNum=" + praiseNum +
            ", topStatus=" + topStatus +
            ", createtime=" + createtime +
        "}";
    }
}
