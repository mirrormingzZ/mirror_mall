package com.iwonder.tea.usr.dao;

import java.util.ArrayList;

import com.iwonder.tea.usr.entity.UserInfo;
import com.iwonder.tea.usr.view.UserInfoConditionView;
import com.iwonder.tea.usr.view.UserInfoQueryView;

public interface IUserInfoDao {

	public ArrayList<UserInfo> list();
	
	public ArrayList<UserInfoQueryView> list(UserInfoConditionView userInfoConditionView);
	
	public void delete(String userId);
	
	public UserInfo load(String userId);
	
	public void insert(UserInfo userInfo);
	
	public void update(UserInfo userInfo);

	public UserInfo login(UserInfo userInfo);

}
