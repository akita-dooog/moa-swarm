package com.akita.moa.roster.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Api("健康检查")
@RestController
@RequestMapping("/hello")
public class HelloController {
    private static final Date startTime = new Date();

    @ApiOperation(value = "测试", notes="测试是否健康")
    @GetMapping("/greet/{name}")
    public String greet(@ApiParam(name = "name", value = "测试输入的名字", required = true) @PathVariable String name) {
        return startTime +"\n hello!" + name;
    }
}
