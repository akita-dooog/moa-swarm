package com.akita.moa.desk.controller;

import com.akita.moa.common.api.CommonResult;
import com.akita.moa.desk.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/app")
public class AppController {
    @Autowired
    private AppService appService;

    @GetMapping("/{username}")
    public CommonResult listByUsername(@PathVariable String username) {
        return CommonResult.success(appService.listByUsername(username));
    }
}
