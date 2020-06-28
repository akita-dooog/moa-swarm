package com.akita.moa.portal.dto;

import lombok.Data;

@Data
public class LoginRes {
    private String tokenHead;

    private String token;

    public LoginRes(String tokenHead, String token) {
        this.tokenHead = tokenHead;
        this.token = token;
    }
}
