package com.akita.moa.security;

import org.springframework.security.core.GrantedAuthority;

import java.util.HashSet;
import java.util.Set;

public class MoaUserAuthority<T> implements GrantedAuthority {
    private String moaAuthKey;

    private Set<T> sources;

    public MoaUserAuthority (String moaAuthKey, T source) {
        this.moaAuthKey = moaAuthKey;
        this.sources = new HashSet<>();
        this.sources.add(source);
    }

    public String getAuthority() {
        return moaAuthKey;
    }

    public Set<T> getSources() {
        return this.sources;
    }
}
