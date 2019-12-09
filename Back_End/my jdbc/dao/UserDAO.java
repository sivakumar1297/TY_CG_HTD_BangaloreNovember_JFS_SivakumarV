package com.capgemini.jdbc.dao;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;

public interface UserDAO 
{
public List<UserBean>getAllUsers();

public UserBean userLogin(String username, String password);
public boolean updateUser(int userid, String password, String email);
public  boolean InsertUser(UserBean user);
public boolean DeleteUser(int userid, String password);
}
