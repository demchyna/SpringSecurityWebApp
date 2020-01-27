package com.softserve.academy.security;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {

    private long id;
    private String authority;

    public Role(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
