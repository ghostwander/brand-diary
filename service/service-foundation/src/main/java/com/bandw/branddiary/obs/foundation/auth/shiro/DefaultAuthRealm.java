package com.bandw.branddiary.obs.foundation.auth.shiro;

import com.bandw.branddiary.obs.foundation.auth.entity.AuthUser;
import com.bandw.branddiary.obs.foundation.auth.service.AuthService;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("defaultAuthRealm")
public class DefaultAuthRealm extends AuthenticatingRealm {

    @Resource
    private AuthService authService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String principal = (String) authenticationToken.getPrincipal();
        AuthUser authUser = authService.getAuthUser(principal);
        return new SimpleAuthenticationInfo(authUser.getIdentifier(),authUser.getCredential(), ByteSource.Util.bytes(authUser.getRegisterTime()),this.getName());
    }
}
