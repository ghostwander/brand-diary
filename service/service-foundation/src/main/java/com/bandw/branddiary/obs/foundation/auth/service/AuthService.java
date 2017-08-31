package com.bandw.branddiary.obs.foundation.auth.service;

public interface AuthService {
	
	/**
	 * 登录
	 * @param identifier 登录标识
	 * @param credential 密码凭证
	 * @return 是否登录成功
	 */
	public boolean login(String identifier, String credential);

	/**
	 *
	 * @param identitfier
	 * @return 是否是正常用户
	 */
	public boolean isVaildUser(String identitfier);
	
	/**
	 * 登出
	 * @param userid 用户id
	 * @return 是否登出成功
	 */
	public boolean logout(String userid);
}
