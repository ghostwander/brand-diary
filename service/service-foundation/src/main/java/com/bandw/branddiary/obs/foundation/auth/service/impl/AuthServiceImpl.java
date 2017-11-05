package com.bandw.branddiary.obs.foundation.auth.service.impl;

import com.bandw.branddiary.core.service.BaseServiceImpl;
import com.bandw.branddiary.obs.foundation.auth.entity.AuthUser;
import com.bandw.branddiary.obs.foundation.auth.service.AuthService;
import org.springframework.stereotype.Service;

@Service("authService")
public class AuthServiceImpl extends BaseServiceImpl implements AuthService{
    @Override
    public boolean login(String identifier, String credential) {
        return true;
    }

    @Override
    public boolean isVaildUser(String ide) {
        return true;
    }

    @Override
    public AuthUser getAuthUser(String identitfier) {
        return null;
    }

    @Override
    public boolean logout(String userid) {
        return true;
    }
}
