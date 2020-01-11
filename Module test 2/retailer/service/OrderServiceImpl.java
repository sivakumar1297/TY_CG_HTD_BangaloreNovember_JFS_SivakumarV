package com.capgrmini.retailer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgrmini.retailer.dao.OrderDao;
import com.capgrmini.retailer.dto.OrderInfo;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao dao;

	@Override
	public OrderInfo getOrder(int order_id) {
		// TODO Auto-generated method stub
		return dao.getOrder(order_id);
	}
	
	

}
