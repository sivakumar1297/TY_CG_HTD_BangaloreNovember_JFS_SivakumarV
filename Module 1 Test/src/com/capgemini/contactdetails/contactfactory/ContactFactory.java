package com.capgemini.contactdetails.contactfactory;

import com.capgemini.contactdetails.contactdao.ContactDao;
import com.capgemini.contactdetails.contactdao.ContactDaoImpl;
import com.capgemini.contactdetails.contactservices.ContactServices;
import com.capgemini.contactdetails.contactservices.ContactServicesImpl;

public class ContactFactory {

	public static ContactDao instanceOfContactDaoImpl() {
	ContactDao dao = new ContactDaoImpl();
	return dao;
	}
	public static ContactServices instanceOfContactservicesImpl() {
		ContactServices services = new ContactServicesImpl();
		return services;
		}
		
}
