package com.capgrmini.retailer.exception;

public class OrderException extends RuntimeException {
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public OrderException(String msg) {
		super();
		this.msg = msg;
	}
	

}
