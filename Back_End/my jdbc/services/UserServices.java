package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;

public interface UserServices 
{
	public List<UserBean>getAllUsers();
    public UserBean userLogin (String username,String password);
    public boolean updateUser(int userid, String password, String email);
    public  boolean InsertUser(UserBean user);
    public boolean DeleteUser(int userid, String password);
}
