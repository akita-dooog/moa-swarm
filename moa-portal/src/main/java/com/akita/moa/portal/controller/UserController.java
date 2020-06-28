package com.akita.moa.portal.controller;

import com.akita.moa.common.api.CommonResult;
import com.akita.moa.model.UmsUser;
import com.akita.moa.portal.dto.LoginRes;
import com.akita.moa.portal.service.UserService;
import com.akita.moa.security.config.JwtConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api("用户登录")
@RestController
@RequestMapping("/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private JwtConfig jwtConfig;

    @ApiOperation(value = "登录接口", notes = "前端登录校验，返回token")
    @PostMapping("/login")
    public CommonResult login(@ApiParam("账号") @RequestParam String username, @ApiParam("密码") @RequestParam String password) {
        String token = userService.login(username, password);
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        return CommonResult.success(new LoginRes(jwtConfig.getTokenHead(), token));
    }

    @ApiOperation(value = "查询用户", notes = "通过用户账号查询用户详情")
    @GetMapping("/user/{username}")
    public UmsUser getUser(@ApiParam("账号") @PathVariable String username) {
        return userService.getByUsername(username);
    }
}
