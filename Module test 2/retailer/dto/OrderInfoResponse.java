package com.capgrmini.retailer.dto;

import java.util.List;

public class OrderInfoResponse {
	

	private int statusCode;
	private String message;
	private String description;
	private List<OrderInfo> account;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<OrderInfo> getAccount() {
		return account;
	}
	public void setAccount(List<OrderInfo> account) {
		this.account = account;
	}

}
