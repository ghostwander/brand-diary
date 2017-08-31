package com.bandw.branddiary.obs.foundation.auth.entity;

import com.bandw.branddiary.core.entity.BaseEntity;

import java.util.Date;

public class AuthUser extends BaseEntity{
	String userId;
	/**登录类型（手机号 邮箱 用户名）或第三方应用名称（微信 微博等）*/
	String identityType;
	/**标识（手机号 邮箱 用户名或第三方应用的唯一标识）*/
	String identifier;
	/**密码凭证（站内的保存密码，站外的不保存或保存token）*/
	String credential;
	/**自动登录用token*/
	String token;
	/**上次登录ip*/
	String lastLoginIp;
	/**上次登录时间*/
	Date lastLoginTime;
	/**注册ip*/
	String registerIp;
	/**注册时间*/
	Date registerTime;
}
