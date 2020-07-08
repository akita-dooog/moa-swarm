package com.akita.moa.govern.controller;

import com.akita.moa.common.api.CommonResult;
import com.akita.moa.govern.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api("组织架构-用户管理")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据用户权限拉取所有用户信息")
    @GetMapping("/all")
    public CommonResult listUser(@ApiParam("增量时间参数") @RequestParam(required = false) String datetime) {
        return CommonResult.success(userService.incList(datetime));
    }
}
