package com.capgemini.exception;

public class DayLimit extends RuntimeException{
String msg="day limit exceeds";
public DayLimit() {
	super();
}
public DayLimit(String msg) {
	super();
	this.msg = msg;
}
@Override
public String getMessage() {
	return msg;
}


}

