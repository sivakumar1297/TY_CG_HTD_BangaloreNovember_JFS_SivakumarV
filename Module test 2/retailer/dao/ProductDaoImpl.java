package com.capgrmini.retailer.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgrmini.retailer.dto.ProductInfo;
import com.capgrmini.retailer.exception.ProductException;
@Repository
public class ProductDaoImpl implements ProductDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public ProductInfo getProduct(int product_id) {
		EntityManager manager = factory.createEntityManager();
		ProductInfo info = manager.find(ProductInfo.class, product_id);
		if(info!=null) {
		return info;
	}else {
		throw new ProductException("Product-Id Doesnot Exists");
	}

}
	
//	@Override
//	public boolean addProduct(ProductInfo info) {
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		try {
//			transaction.begin();
//			
//			manager.persist(info);
//			transaction.commit();
//			return true;
//		} catch (Exception e) {
//			throw new ProductException("Product-Id Already Exists");
//		}
//	}
//	@Override
//	public boolean deleteProduct(int id) {
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		ProductInfo info = manager.find(ProductInfo.class, id);
//		if (info != null) {
//			transaction.begin();
//			manager.remove(info);
//			transaction.commit();
//			return true;
//		} else {
//			throw new ProductException("Product-Name Doesnot Exists");
//		}
//	}

}
