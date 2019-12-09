package com.capgemini.forestmanagementsystem.factory;


import com.cagemini.forestmanagementsystem.dao.ProductDAO;
import com.cagemini.forestmanagementsystem.dao.ProductDAOImpl;
import com.capgemini.forestmanagementsystem.services.ProductServices;
import com.capgemini.forestmanagementsystem.services.ProductServicesImpl;


public class ProductFactory {
	private ProductFactory() {

	}

	public static ProductDAO instanceOfProductDAOImpl() {
		ProductDAO dao = new ProductDAOImpl();
		return dao;
	}

	public static ProductServices instanceOfProductServicesImpl() {
		ProductServices dao = new ProductServicesImpl();
		return dao;
	}

}
