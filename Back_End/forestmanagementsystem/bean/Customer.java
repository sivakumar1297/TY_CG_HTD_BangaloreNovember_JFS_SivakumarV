package com.capgemini.forestmanagementsystem.bean;

import lombok.Data;

@Data
public class Customer {

	private int customer_id;
	private String customer_name;
	private String address1;
	private String address2;
	private String town;
	private int postal_code;
	private String email;
	private int telephone_no;

	@Override
	public String toString() {
		return "\ncustomer_id=" + customer_id + ", customer_name=" + customer_name + ", address1=" + address1
				+ ", address2=" + address2 + ", town=" + town + ", postal_code=" + postal_code + ", email=" + email
				+ ", telephone_no=" + telephone_no;
	}

}
