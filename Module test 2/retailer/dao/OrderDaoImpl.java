package com.capgrmini.retailer.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgrmini.retailer.dto.OrderInfo;
import com.capgrmini.retailer.exception.OrderException;
@Repository
public class OrderDaoImpl implements OrderDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public OrderInfo getOrder(int order_id) {
		EntityManager manager = factory.createEntityManager();
		OrderInfo info = manager.find(OrderInfo.class, order_id);
		if(info!=null) {
		return info;
	}else {
		throw new OrderException("Product-Id Doesnot Exists");
	}
	
		
	}

}
