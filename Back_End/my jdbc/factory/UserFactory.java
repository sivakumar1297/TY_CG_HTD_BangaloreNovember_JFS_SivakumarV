package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.dao.UserDaoImpl;
import com.capgemini.jdbc.services.UserServices;
import com.capgemini.jdbc.services.UserServiceImpl;


public class UserFactory {
	private UserFactory() {
		
	}
	public static UserDAO instanceOfUserDaoImpl() {
		UserDAO dao = new UserDaoImpl();
		return dao;
	}
	public  static UserServices instanceOfUserServices() {
		UserServices services = new UserServiceImpl();
		return services;
		
	}

}
