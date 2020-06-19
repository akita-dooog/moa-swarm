package com.akita.moa.worktable.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class H5AppController {

    @GetMapping("/{userId}")
    String listApp(@PathVariable String userId) {
        return "list app:" + userId;
    }
}
