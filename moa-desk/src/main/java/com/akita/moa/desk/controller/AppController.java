package com.akita.moa.desk.controller;

import com.akita.moa.common.api.CommonResult;
import com.akita.moa.desk.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {
    @Autowired
    private AppService appService;

    @GetMapping("/weapp")
    public CommonResult list() {
        return CommonResult.success(null);
    }
}
