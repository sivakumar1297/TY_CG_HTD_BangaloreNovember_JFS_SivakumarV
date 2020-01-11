package com.capgrmini.retailer.service;



import com.capgrmini.retailer.dto.UserInfo;

public interface UserService {
	
	public boolean signup(UserInfo bean);
	
	public UserInfo login(UserInfo bean);
	
	public boolean changePassword(int id,String password);

}
