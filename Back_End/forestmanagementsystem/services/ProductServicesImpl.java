package com.capgemini.forestmanagementsystem.services;

import java.util.List;

import com.cagemini.forestmanagementsystem.dao.ProductDAO;
import com.capgemini.forestmanagementsystem.bean.Product;
import com.capgemini.forestmanagementsystem.factory.ProductFactory;

public class ProductServicesImpl implements ProductServices{
                    ProductDAO dao = ProductFactory.instanceOfProductDAOImpl();
	@Override
	public boolean addproduct(Product pobj) {
		// TODO Auto-generated method stub
		return dao.addproduct(pobj) ;
	}

	@Override
	public boolean deleteProduct(int prodid) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(prodid);
	}

	@Override
	public boolean modifyProductName(int prodid, String product_name) {
		// TODO Auto-generated method stub
		return dao.modifyProductName(prodid, product_name);
	}

	@Override
	public boolean modifyProductDate(int prodid, String product_date) {
		// TODO Auto-generated method stub
		return dao.modifyProductDate(prodid, product_date);
	}

	@Override
	public Product searchProduct(int prodid) {
		// TODO Auto-generated method stub
		return dao.searchProduct(prodid);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.getAllProduct();
	}
	
}
