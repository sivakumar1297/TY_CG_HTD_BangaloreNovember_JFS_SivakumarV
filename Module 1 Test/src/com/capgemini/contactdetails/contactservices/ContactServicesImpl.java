package com.capgemini.contactdetails.contactservices;

import java.util.List;

import com.capgemini.contactdetails.admin.Contact;
import com.capgemini.contactdetails.bean.ContactBean;
import com.capgemini.contactdetails.contactdao.ContactDao;
import com.capgemini.contactdetails.contactfactory.ContactFactory;

public class ContactServicesImpl implements ContactServices  {
     ContactDao dao = ContactFactory.instanceOfContactDaoImpl();

	@Override
	public List<ContactBean> showAllContact() {
		// TODO Auto-generated method stub
		return dao.showAllContact();
	}

	@Override
	public ContactBean searchContact(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertContact(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateContact(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(String name) {
		// TODO Auto-generated method stub
		return false;
	}

}