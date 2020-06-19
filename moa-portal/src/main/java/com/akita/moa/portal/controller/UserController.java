package com.akita.moa.portal.controller;

import com.akita.moa.common.api.CommonResult;
import com.akita.moa.model.UmsUser;
import com.akita.moa.portal.service.UserService;
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
    UserService userService;

    @ApiOperation(value = "登录接口", notes = "前端登录校验，返回token")
    @PostMapping("/login")
    public CommonResult login(@ApiParam("账号") @RequestParam String account, @ApiParam("密码") @RequestParam String password) {
        return CommonResult.success(userService.login(account, password));
    }

    @ApiOperation(value = "查询用户", notes = "通过用户账号查询用户详情")
    @GetMapping("/user/{account}")
    public UmsUser getUser(@ApiParam("账号") @PathVariable String account) {
        return userService.getByAccount(account);
    }
}
