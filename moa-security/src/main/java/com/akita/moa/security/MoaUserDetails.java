package com.akita.moa.security;

import lombok.Builder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Builder
public class MoaUserDetails implements UserDetails, MoaUserAuthOperate {
    private String username;

    private boolean isAvailable;

    private Set<MoaUserAuthority> authorities;

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public String getPassword() {
        return null;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAccountNonExpired() {
        return isAvailable;
    }

    public boolean isAccountNonLocked() {
        return isAvailable;
    }

    public boolean isCredentialsNonExpired() {
        return isAvailable;
    }

    public boolean isEnabled() {
        return isAvailable;
    }

    public List getSourcesByAuthKey(MoaAuthKey authKey) {
        return authorities.stream()
                .filter(authority -> authority.getAuthority().equals(authKey.getKey()))
                .map(authority -> authority.getSource())
                .collect(Collectors.toList());
    }

    public boolean addAuthority(MoaUserAuthority authority) {
        return this.authorities.add(authority);
    }

}
