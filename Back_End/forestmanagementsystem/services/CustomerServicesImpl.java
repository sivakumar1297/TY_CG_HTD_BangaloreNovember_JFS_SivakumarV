package com.capgemini.forestmanagementsystem.services;

import java.util.List;

import com.cagemini.forestmanagementsystem.dao.ContractDAO;
import com.cagemini.forestmanagementsystem.dao.CustomerDAO;
import com.capgemini.forestmanagementsystem.factory.ContractFactory;
import com.capgemini.forestmanagementsystem.factory.CustomerFactory;
import com.capgemini.forestmanagementsystem.bean.Customer;

public class CustomerServicesImpl implements CustomerService {

	CustomerDAO dao = CustomerFactory.instanceOfCustomerDAOImpl();

	@Override
	public boolean addCustomer(Customer bean) {
		// TODO Auto-generated method stub
		return dao.addCustomer(bean);
	}

	@Override
	public boolean deleteCustomer(int customer_id) {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(customer_id);
	}

	@Override
	public List<Customer> customerDetail() {
		// TODO Auto-generated method stub
		return dao.customerDetail();
	}

	@Override
	public Customer search(int customer_id) {
		// TODO Auto-generated method stub
		return dao.search(customer_id);
	}

	@Override
	public boolean modify(int cutomer_id, String name) {
		// TODO Auto-generated method stub
		return dao.modify(cutomer_id, name);
	}

	@Override
	public boolean modifyadd1(int cutomer_id, String Address1) {
		// TODO Auto-generated method stub
		return dao.modifyadd1(cutomer_id, Address1);
	}

	@Override
	public boolean modifyaddr2(int cutomer_id, String address2) {
		// TODO Auto-generated method stub
		return dao.modifyaddr2(cutomer_id, address2);
	}

	@Override
	public boolean modifytown(int cutomer_id, String town) {
		// TODO Auto-generated method stub
		return dao.modifytown(cutomer_id, town);
	}

	@Override
	public boolean modifycode(int cutomer_id, int postal_code) {
		// TODO Auto-generated method stub
		return dao.modifycode(cutomer_id, postal_code);
	}

	@Override
	public boolean modifyemail(int cutomer_id, String email) {
		// TODO Auto-generated method stub
		return dao.modifyemail(cutomer_id, email);
	}

	@Override
	public boolean modifytelphone(int cutomer_id, int telphone_no) {
		// TODO Auto-generated method stub
		return dao.modifytelphone(cutomer_id, telphone_no);
	}

}
