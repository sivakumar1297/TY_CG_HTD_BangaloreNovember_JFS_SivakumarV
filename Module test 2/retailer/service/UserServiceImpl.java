package com.capgrmini.retailer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgrmini.retailer.dao.UserDao;
import com.capgrmini.retailer.dto.UserInfo;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	@Override
	public boolean signup(UserInfo bean) {
		// TODO Auto-generated method stub
		return dao.signup(bean);
	}

	@Override
	public UserInfo login(UserInfo bean) {
		// TODO Auto-generated method stub
		return dao.login(bean);
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(id, password);
	}

}
