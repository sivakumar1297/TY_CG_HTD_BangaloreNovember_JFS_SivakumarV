package com.capgrmini.retailer.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgrmini.retailer.dto.OrderInfoResponse;
import com.capgrmini.retailer.dto.ProductInfoResponse;
import com.capgrmini.retailer.dto.UserInfoResponse;
import com.capgrmini.retailer.exception.OrderException;
import com.capgrmini.retailer.exception.ProductException;
import com.capgrmini.retailer.exception.UserException;

@RestControllerAdvice
public class ControllerAdvice {
	
	
	@ExceptionHandler(UserException.class)
	public UserInfoResponse userExcept(UserException e) {
		UserInfoResponse userInfoResponse = new UserInfoResponse();
		userInfoResponse.setStatusCode(501);
		userInfoResponse.setDescription("Exception");
		userInfoResponse.setMessage(e.getMsg());
		return userInfoResponse;
	}
	@ExceptionHandler(ProductException.class)
	public ProductInfoResponse productExcept(ProductException e) {
		ProductInfoResponse productInfoResponse = new ProductInfoResponse();
		productInfoResponse.setStatusCode(501);
		productInfoResponse.setDescription("Exception");
		productInfoResponse.setMessage(e.getMsg());
		return productInfoResponse;
	}
	@ExceptionHandler(OrderException.class)
	public OrderInfoResponse orderExcept(OrderException e) {
		OrderInfoResponse orderInfoResponse = new OrderInfoResponse();
		orderInfoResponse.setStatusCode(501);
		orderInfoResponse.setDescription("Exception");
		orderInfoResponse.setMessage(e.getMsg());
		return orderInfoResponse;
	}

}
