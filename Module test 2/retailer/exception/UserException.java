package com.capgrmini.retailer.exception;

public class UserException extends RuntimeException {

	
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public UserException(String msg) {
		super();
		this.msg = msg;
	}
	
}
