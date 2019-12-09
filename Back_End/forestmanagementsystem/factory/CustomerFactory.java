package com.capgemini.forestmanagementsystem.factory;

import com.cagemini.forestmanagementsystem.dao.CustomerDAO;
import com.cagemini.forestmanagementsystem.dao.CustomerDAOImpl;
import com.capgemini.forestmanagementsystem.services.CustomerService;
import com.capgemini.forestmanagementsystem.services.CustomerServicesImpl;

public class CustomerFactory {

	private CustomerFactory() {

	}

	public static CustomerDAO instanceOfCustomerDAOImpl() {
		CustomerDAO dao = new CustomerDAOImpl();
		return dao;
	}

	public static CustomerService instanceOfCustomerServicesImpl() {
		CustomerService dao = new CustomerServicesImpl();
		return dao;
	}
}
