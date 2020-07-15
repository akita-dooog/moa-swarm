package com.akita.moa.govern.controller;

import com.akita.moa.common.api.CommonResult;
import com.akita.moa.govern.dto.LoginReq;
import com.akita.moa.govern.dto.LoginRes;
import com.akita.moa.govern.service.LoginService;
import com.akita.moa.security.config.JwtConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Api(value = "登录控制器", tags = {"登录控制器"})
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private JwtConfig jwtConfig;

    @ApiOperation(value = "登录接口", notes = "前端登录校验，返回token")
    @PostMapping("/login")
    public CommonResult login(@ApiParam("登录请求体") @RequestBody LoginReq loginReq) {
        Optional<String> token = Optional.of(loginService.login(loginReq));

        return CommonResult.success(new LoginRes(jwtConfig.getTokenHead(), token.get()));
    }
}
