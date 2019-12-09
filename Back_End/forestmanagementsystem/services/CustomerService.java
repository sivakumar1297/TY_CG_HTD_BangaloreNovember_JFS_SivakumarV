package com.capgemini.forestmanagementsystem.services;

import java.util.List;

import com.capgemini.forestmanagementsystem.bean.Customer;

public interface CustomerService {
	public boolean addCustomer(Customer bean);

	public boolean deleteCustomer(int customer_id);

	public List<Customer> customerDetail();

	public Customer search(int customer_id);

	public boolean modify(int cutomer_id, String name);

	public boolean modifyadd1(int cutomer_id, String Address1);

	public boolean modifyaddr2(int cutomer_id, String address2);

	public boolean modifytown(int cutomer_id, String town);

	public boolean modifycode(int cutomer_id, int postal_code);

	public boolean modifyemail(int cutomer_id, String email);

	public boolean modifytelphone(int cutomer_id, int telphone_no);

}
