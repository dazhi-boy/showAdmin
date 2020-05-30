package com.dazhi.base.entity;

import com.dazhi.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 客户表
 * </p>
 *
 * @author dazhi
 * @since 2020-05-28
 */
@ApiModel(value="Consumer对象", description="客户表")
public class Consumer extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Consumer{" +
            "username=" + username +
            ", password=" + password +
        "}";
    }
}
