package com.bandw.branddiary.obs.user.entity;

import java.util.Date;

public class User {
	
	String userId;
	/**昵称*/
	String nickname;
	/**电话*/
	String phone;
	/**头像地址*/
	String avatar;
	/**性别*/
	Integer sex;
	/**生日*/
	Date birthday;
	/**地址*/
	String address;
	/**签名档*/
	String signature;
	/**绑定信息*/
	UserBinding binding;
}
