package com.akita.moa.govern.controller;

import com.akita.moa.common.api.CommonResult;
import com.akita.moa.govern.dto.LoginReq;
import com.akita.moa.govern.dto.LoginRes;
import com.akita.moa.govern.service.UserService;
import com.akita.moa.security.config.JwtConfig;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @Autowired
    private JwtConfig jwtConfig;

    @ApiOperation(value = "登录接口", notes = "前端登录校验，返回token")
    @PostMapping("/login")
    public CommonResult login(@RequestBody LoginReq loginReq) {
        String token = userService.login(loginReq);

        if (token == null) return CommonResult.validateFailed("用户名或密码错误");

        return CommonResult.success(new LoginRes(jwtConfig.getTokenHead(), token));
    }
}
