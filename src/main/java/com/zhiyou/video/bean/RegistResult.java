package com.zhiyou.video.bean;

import com.zhiyou.video.model.UserModel;

/**
 * Created By zhouyc on 2017年7月19日
 * Descr: 注册新用户的操作结果
 *
 */
public class RegistResult extends OperateResult {

	private UserModel user;

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "RegistResult [user=" + user + ", toString()=" + super.toString() + "]";
	}
	
	
}
