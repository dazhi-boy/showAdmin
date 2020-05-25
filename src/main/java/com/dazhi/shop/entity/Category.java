package com.dazhi.shop.entity;

import com.dazhi.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 无限级商品分类表
 * </p>
 *
 * @author dazhi
 * @since 2020-05-25
 */
@TableName("shop_category")
@ApiModel(value="Category对象", description="无限级商品分类表")
public class Category extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "公司id")
    private Long companyId;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "父级id")
    private Long parentid;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createtime;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Category{" +
            "companyId=" + companyId +
            ", title=" + title +
            ", parentid=" + parentid +
            ", createtime=" + createtime +
        "}";
    }
}
