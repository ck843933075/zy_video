package com.zhiyou.video.service;

import com.zhiyou.video.bean.LoginResult;
import com.zhiyou.video.bean.OperateResult;
import com.zhiyou.video.bean.RegistResult;
import com.zhiyou.video.model.UserModel;
import com.zhiyou.video.query.RegistUserInfo;
import com.zhiyou.video.query.UpdatePwdInfo;

/**
 * Created By zhouyc on 2017年7月19日
 * Descr:
 *
 */
public interface IFrontUserService {
	
	//注册新用户
	public RegistResult registUser(RegistUserInfo userInfo);
	
	//用户登录
	public LoginResult loginUser(String email,String pwd);
	
	public UserModel queryUserByEmail(String email);
	
	public UserModel queryUserById(int id);
	
	//更新用户密码
	public boolean updateUserPwd(int id,String pwd);
	
	public boolean updateUserInfo(UserModel model);
	
	public boolean updateUserHead(int id,String head);
	
	//清空用户的验证码信息
	public void cleanCaptcha(String email);
	
	//保存验证码
	public void updateUserCaptcha(String email,String captcha);
	
	public OperateResult updateUserPassword(int id,UpdatePwdInfo info);
	

}
