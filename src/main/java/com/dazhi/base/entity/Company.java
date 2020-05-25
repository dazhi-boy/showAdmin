package com.dazhi.base.entity;

import com.dazhi.common.BaseEntity;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 公司表
 * </p>
 *
 * @author dazhi
 * @since 2020-05-25
 */
@ApiModel(value="Company对象", description="公司表")
public class Company extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "公司名")
    private String name;

    @ApiModelProperty(value = "公司类型")
    private String type;

    @ApiModelProperty(value = "总裁")
    private String ceo;

    @ApiModelProperty(value = "总裁电话")
    private String ceoPhone;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createtime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
    public String getCeoPhone() {
        return ceoPhone;
    }

    public void setCeoPhone(String ceoPhone) {
        this.ceoPhone = ceoPhone;
    }
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Company{" +
            "name=" + name +
            ", type=" + type +
            ", ceo=" + ceo +
            ", ceoPhone=" + ceoPhone +
            ", createtime=" + createtime +
        "}";
    }
}
