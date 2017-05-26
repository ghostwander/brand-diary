package com.bandw.branddiary.auth.service;

public interface AuthService {
	
	/**
	 * 
	 * @param identifier 登录标识
	 * @param credential 登录
	 * @return
	 */
	public boolean login(String identifier, String credential);
	public boolean logout(String userid);
}
