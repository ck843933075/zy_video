package com.zhiyou.video.mapper;

import java.util.HashMap;

import com.zhiyou.video.model.UserModel;

/**
 * Created By zhouyc on 2017年7月19日
 * Descr:
 *
 */
public interface FrontUserMapper {
	
	public UserModel queryUserByEmail(String email);
	
	public int insertUserModel(UserModel model);
	
	public UserModel queryUserById(int id);
	
	public void updateCaptcha(HashMap map);
	
	public int updateUserPwd(HashMap map);
	
	public int updateUserInfo(UserModel user);
	
	public int updateUserHead(HashMap map);

}
