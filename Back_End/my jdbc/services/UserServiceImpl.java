package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class UserServiceImpl implements UserServices {
   UserDAO dao = UserFactory.instanceOfUserDaoImpl();
	@Override
	public List<UserBean> getAllUsers() {
	   
		return dao.getAllUsers();
	}

	@Override
	public UserBean userLogin(String username, String password) {
		return dao.userLogin(username, password);
	}

	@Override
	public boolean updateUser(int userid, String password, String email) {
		// TODO Auto-generated method stub
		return dao.updateUser(userid, password, email);
	}

	@Override
	public boolean InsertUser(UserBean user) {
		// TODO Auto-generated method stub
		return dao.InsertUser(user);
	}

	@Override
	public boolean DeleteUser(int userid, String password) {
		// TODO Auto-generated method stub
		return dao.DeleteUser(userid, password);
	}

}
