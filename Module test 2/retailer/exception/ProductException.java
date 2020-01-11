package com.capgrmini.retailer.exception;

public class ProductException extends RuntimeException {
	
String msg;

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public ProductException(String msg) {
	super();
	this.msg = msg;
}

}
