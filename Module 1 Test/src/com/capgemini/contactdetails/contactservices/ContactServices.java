package com.capgemini.contactdetails.contactservices;

import java.util.List;


import com.capgemini.contactdetails.bean.ContactBean;

public interface ContactServices {

	

	public List<ContactBean> showAllContact();
    public ContactBean searchContact(String name);
    public boolean insertContact(String name);
    public boolean updateContact(String name);
    public boolean deleteContact(String name);

}
