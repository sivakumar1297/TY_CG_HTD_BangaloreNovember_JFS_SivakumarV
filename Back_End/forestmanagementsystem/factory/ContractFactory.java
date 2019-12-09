package com.capgemini.forestmanagementsystem.factory;

import com.cagemini.forestmanagementsystem.dao.ContractDAO;
import com.cagemini.forestmanagementsystem.dao.ContractDAOImpl;
import com.capgemini.forestmanagementsystem.services.ContractServices;
import com.capgemini.forestmanagementsystem.services.ContractServicesImpl;

public class ContractFactory {
	private ContractFactory() {

	}

	public static ContractDAO instanceOfContaractDAOImpl() {
		ContractDAO dao = new ContractDAOImpl();
		return dao;
	}

	public static ContractServices instanceOfContaractServicesImpl() {
		ContractServices dao = new ContractServicesImpl();
		return dao;
	}
}
