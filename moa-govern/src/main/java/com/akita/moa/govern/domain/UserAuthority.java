package com.akita.moa.govern.domain;

import org.springframework.security.core.GrantedAuthority;

import java.util.List;

public class UserAuthority<T> implements GrantedAuthority {
    private final String authKey;
    private List<T> sources;

    public UserAuthority(String authKey, List<T> sources) {
        this.authKey = authKey;
        this.sources = sources;
    }

    @Override
    public String getAuthority() {
        return this.authKey;
    }

    public List<T> getSources() {
        return this.sources;
    }
}
