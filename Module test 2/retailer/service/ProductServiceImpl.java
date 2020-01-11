package com.capgrmini.retailer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgrmini.retailer.dao.ProductDao;
import com.capgrmini.retailer.dto.ProductInfo;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao dao;

	@Override
	public ProductInfo getProduct(int product_id) {
		// TODO Auto-generated method stub
		return dao.getProduct(product_id);
	}

//	@Override
//	public boolean addProduct(ProductInfo info) {
//		// TODO Auto-generated method stub
//		return dao.addProduct(info);
//	}
//
//	@Override
//	public boolean deleteProduct(int product_id) {
//		// TODO Auto-generated method stub
//		return dao.deleteProduct(product_id);
//	}
//	
	

}
