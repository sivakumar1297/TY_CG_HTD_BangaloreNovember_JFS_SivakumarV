package com.capgrmini.retailer.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgrmini.retailer.dto.OrderInfo;
import com.capgrmini.retailer.dto.OrderInfoResponse;
import com.capgrmini.retailer.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService  service;
	@GetMapping(path = "/search-order", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfoResponse searchProduct(@RequestParam("id") int id) {
		OrderInfoResponse response = new OrderInfoResponse();
		OrderInfo info = service.getOrder(id);
		if (info != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order found");
			response.setAccount(Arrays.asList(info));
		} 
		return response;
	}
	

}
