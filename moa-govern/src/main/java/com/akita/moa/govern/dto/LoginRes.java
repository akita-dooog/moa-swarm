package com.akita.moa.govern.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("登录返回")
public class LoginRes {
    @ApiModelProperty(value = "token头", notes = "请求的时放在token前，并且之间需要加空格")
    private String tokenHead;

    private String token;

    public LoginRes(String tokenHead, String token) {
        this.tokenHead = tokenHead;
        this.token = token;
    }
}
