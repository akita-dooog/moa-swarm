package com.akita.moa.govern.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("登录请求")
public class LoginReq {
    @ApiModelProperty("登录名")
    private String username;

    @ApiModelProperty("密码")
    private String password;
}
