package com.cagemini.forestmanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import javax.rmi.PortableRemoteObject;

import com.capgemini.forestmanagementsystem.bean.Product;

public class ProductDAOImpl implements ProductDAO{
  List<Product> l1 = new ArrayList<Product>();
  Product pro = new Product();
@Override
public boolean addproduct(Product pobj) {
	for (Product product : l1) {
		if(product.getProdid()==pobj.getProdid()) {
			System.out.println("Already Exist");
			return false;
		}
	}l1.add(pobj);
	return true;
}

@Override
public boolean deleteProduct(int prodid) {
	for (Product product : l1) {
		if(product.getProdid()==prodid) {
			l1.remove(prodid);
			return true;
		}
	}
	System.out.println("IT doesnt Exist");
	return false;
}

@Override
public boolean modifyProductName(int prodid, String product_name) {
	for (Product product : l1)
	{
	if(product.getProdid()==prodid) {
		pro = product;
		pro.setProduct_name(product_name);
		return true;
	}
	}
	return false;
}

@Override
public boolean modifyProductDate(int prodid, String product_date) {
	for (Product product : l1)
 {
			if(product.getProdid()==prodid)
			{
				pro=product;
				pro.setProduct_date(product_date);
				return true;
			}
 }
	return false;
}

@Override
public Product searchProduct(int prodid) {
	for (Product product : l1) {
		if(product.getProdid()==prodid)
		{
			return product;
		}
	}
	return null;
	
}

@Override
public List<Product> getAllProduct() {
	// TODO Auto-generated method stub
	return l1;
}
  
}
