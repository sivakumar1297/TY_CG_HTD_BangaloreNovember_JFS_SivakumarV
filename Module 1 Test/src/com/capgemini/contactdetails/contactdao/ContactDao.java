package com.capgemini.contactdetails.contactdao;
import com.capgemini.contactdetails.admin.Contact;
import com.capgemini.contactdetails.bean.ContactBean;

import java.util.List;

public interface ContactDao {
	



		public List<ContactBean> showAllContact();
	    public ContactBean searchContact(String name);
	    public boolean insertContact(String name);
	    public boolean updateContact(String name);
	    public boolean deleteContact(String name);

			
			
			
		}


