package com.tsj.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created by Administrator on 2021/7/8.
 */
public class JwtToken implements AuthenticationToken {
    private String token;

    public JwtToken(String jwt){
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
