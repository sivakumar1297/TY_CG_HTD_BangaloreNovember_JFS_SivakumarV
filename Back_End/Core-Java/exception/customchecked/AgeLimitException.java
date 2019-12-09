package com.capgemini.exception.customchecked;

public class AgeLimitException extends Exception {
	String msg ="age>18";

	public AgeLimitException() {
		super();
	}

	public AgeLimitException(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
	

}
