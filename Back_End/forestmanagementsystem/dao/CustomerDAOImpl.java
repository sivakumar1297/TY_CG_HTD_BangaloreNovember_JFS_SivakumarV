package com.cagemini.forestmanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.forestmanagementsystem.bean.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	List<Customer> list = new ArrayList<Customer>();
	Customer custobj;

	public boolean addCustomer(Customer bean) {
		for (Customer customer : list) {
			if (customer.getCustomer_id() == bean.getCustomer_id())
				return false;
		}
		list.add(bean);
		return true;
	}

	@Override
	public boolean deleteCustomer(int customer_id) {
		for (Customer customer : list) {
			if (customer.getCustomer_id() == customer_id) {
				list.remove(customer);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Customer> customerDetail() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Customer search(int customer_id) {
		// TODO Auto-generated method stub
		for (Customer customer : list) {
			if (customer.getCustomer_id() == customer_id)
				return customer;
		}
		return null;
	}

	@Override
	public boolean modify(int cutomer_id, String name) {
		for (Customer customer : list) {
			if (customer.getCustomer_id() == cutomer_id) {
				custobj = customer;
				custobj.setCustomer_name(name);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean modifyadd1(int cutomer_id, String Address1) {

		for (Customer customer : list) {
			if (customer.getCustomer_id() == cutomer_id) {
				custobj = customer;
				custobj.setAddress1(Address1);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean modifyaddr2(int cutomer_id, String address2) {
		for (Customer customer : list) {
			if (customer.getCustomer_id() == cutomer_id) {
				custobj = customer;
				custobj.setAddress2(address2);
				return true;
			}
		} // TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifytown(int cutomer_id, String town) {
		for (Customer customer : list) {
			if (customer.getCustomer_id() == cutomer_id) {
				custobj = customer;
				custobj.setTown(town);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean modifycode(int cutomer_id, int postal_code) {
		for (Customer customer : list) {
			if (customer.getCustomer_id() == cutomer_id) {
				custobj = customer;
				custobj.setPostal_code(postal_code);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean modifyemail(int cutomer_id, String email) {
		for (Customer customer : list) {
			if (customer.getCustomer_id() == cutomer_id) {
				custobj = customer;
				custobj.setEmail(email);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean modifytelphone(int cutomer_id, int telphone_no) {
		for (Customer customer : list) {
			if (customer.getCustomer_id() == cutomer_id) {
				custobj = customer;
				custobj.setTelephone_no(telphone_no);
				return true;
			}
		}
		return false;
	}

}
