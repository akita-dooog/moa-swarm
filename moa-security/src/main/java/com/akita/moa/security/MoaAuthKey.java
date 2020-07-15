package com.akita.moa.security;

public enum  MoaAuthKey {
    MY_COMPANY_ID("my:company:id");

    private String key;

    MoaAuthKey(String key) {
        this.key = key;
    }

    String getKey() {
        return key;
    }
}
