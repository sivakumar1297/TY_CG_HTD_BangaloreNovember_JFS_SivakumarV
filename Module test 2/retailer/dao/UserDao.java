package com.capgrmini.retailer.dao;

import com.capgrmini.retailer.dto.UserInfo;

public interface UserDao {
	
	public boolean signup(UserInfo bean);
	
	public UserInfo login(UserInfo bean);
	
	public boolean changePassword(int id,String password);

}
