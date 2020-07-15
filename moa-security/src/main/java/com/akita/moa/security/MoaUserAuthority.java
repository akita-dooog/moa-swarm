package com.akita.moa.security;

import org.springframework.security.core.GrantedAuthority;

public class MoaUserAuthority<T> implements GrantedAuthority {
    private MoaAuthKey moaAuthKey;

    private T source;

    public MoaUserAuthority (MoaAuthKey moaAuthKey, T source) {
        this.moaAuthKey = moaAuthKey;
        this.source = source;
    }

    public String getAuthority() {
        return moaAuthKey.getKey();
    }

    public T getSource() {
        return this.source;
    }
}
