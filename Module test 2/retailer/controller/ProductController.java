package com.capgrmini.retailer.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgrmini.retailer.dto.ProductInfo;
import com.capgrmini.retailer.dto.ProductInfoResponse;
import com.capgrmini.retailer.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	
	@GetMapping(path = "/search-product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse searchProduct(@RequestParam("id") int id) {
		ProductInfoResponse response = new ProductInfoResponse();
		ProductInfo info = service.getProduct(id);
		if (info != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setAccount(Arrays.asList(info));
		} 
		return response;
	}

//	@PostMapping(path = "/add-product", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ProductInfoResponse addProduct(@RequestBody ProductInfo product) {
//		ProductInfoResponse response = new ProductInfoResponse();
//		if (service.addProduct(product)) {
//			response.setStatusCode(201);
//			response.setMessage("Success");
//			response.setDescription("Product added");
//		} 
//		return response;
//	}
//	@DeleteMapping(path = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ProductInfoResponse deleteProduct(@PathVariable("id") int id) {
//
//		ProductInfoResponse responce = new ProductInfoResponse();
//		service.deleteProduct(id);
//		responce.setStatusCode(201);
//		responce.setMessage("Success");
//		responce.setDescription("Product Deleted");
//		return responce;
//
//	}
}
