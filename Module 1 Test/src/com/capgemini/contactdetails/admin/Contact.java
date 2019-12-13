package com.capgemini.contactdetails.admin;

import java.util.List;
import java.util.Scanner;

import com.capgemini.contactdetails.bean.ContactBean;
import com.capgemini.contactdetails.contactfactory.ContactFactory;
import com.capgemini.contactdetails.contactservices.ContactServices;

public class Contact
{
public static void main(String[] args) {
	ContactServices services = ContactFactory.instanceOfContactservicesImpl();
	ContactBean contact = new ContactBean();
//	Scanner sc = new Scanner(System.in);
	Scanner in = new Scanner(System.in);
	while(true) {
		System.out.println("1.showAllContact");
		System.out.println("2.InsertContact");
		System.out.println("3.Update contact");
		System.out.println("4.Delete contact");
		System.out.println("5.Return");
		char ch ='y';
		System.out.println(" 1.Insert contact 2.Delete contact\n 3.Update contact\n 4.view all contacts\n "
				+ "5.Go back");
	
		int choice = in.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the contact datail");
		  ContactBean con = new ContactBean();
			System.out.println("Enter the name ");
			con.setName(in.next());
			System.out.println("enter the phone number");
			con.setNumber(in.nextInt());
			System.out.println("enter the group category");
			con.setGroupCategory(in.next());
			if(services.insertContact(con)) {
				System.out.println("inserted");
			} else {
				System.out.println("not inserted");
			}
			break;
		case 2:
			System.out.println("enter contact name to delete");
			String name=in.next();
			if(services.deleteContact(name)) {
				System.out.println("contact deleted");
			} else {
				System.out.println("contact not found");
			}
			break;
		case 3:
			System.out.println("enter the contact name to update");
			String s1=in.next();
			ContactBean con2=services.searchContact(s1);
			if(con2!=null) {
				System.out.println("enter the new number to update ");
				String num=in.next();
				if(services.updateContact(s1)) {
					System.out.println(" updated");
				} else {
					System.out.println(" not updated");
				} 
			} else {
				System.out.println(" not found");
			}
			break;
		case 4:
			List<ContactBean> l1= services.showAllContact();
			if(l1!=null) {
				for (ContactBean c1 : l1) {
					System.out.println(c1);
				}
			} else {
				System.out.println("not found");
			}
			break;
		case 5:
			Return home;
			break;
		default:
			System.out.println("enter the above mentione options ");
			break;
		}
	}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		switch (choice)
		{
		case 1: 
			if(services.showAllContact(contact)==null) {
				System.out.println("No Contacts present");
		}else {
				System.out.println(services.showAllContact(contact));
		}
			 break;
		case 2 :
			ContactBean c1 = new ContactBean();
			System.out.println("Enter the Contact name");
			
			if(services.searchContact(c1.getName()) {
			
			
			
			
			
			
			
			
			
		}
		
		
		
	}
}
}
blic class CRUDContact {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		CRUDDao dao= Factory.objectCRUDDaoImpl();
		while(true) {
			System.out.println("Enter option to perform operations");
			System.out.println(" 1.Insert contact\n 2.Delete contact\n 3.Update contact\n 4.view all contacts\n "
					+ "5.Go back");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the contact details to insert");
				Contact con = new Contact();
				System.out.println("Enter the name ");
				con.setName(sc.next());
				System.out.println("enter the phone number");
				con.setNumber(sc.next());
				System.out.println("enter the group name");
				con.setGroupCategory(sc.next());
				if(dao.insertContact(con)) {
					System.out.println("contact inserted");
				} else {
					System.out.println("contact not inserted");
				}
				break;
			case 2:
				System.out.println("enter contact name to delete");
				String name=sc.next();
				if(dao.deleteContact(name)) {
					System.out.println("contact deleted");
				} else {
					System.out.println("contact not found");
				}
				break;
			case 3:
				System.out.println("enter the contact name to update");
				String name1=sc.next();
				Contact con2=dao.viewContact(name1);
				if(con2!=null) {
					System.out.println("enter the new number to update ");
					String num=sc.next();
					if(dao.updateContact(name1, num)) {
						System.out.println("contact updated");
					} else {
						System.out.println("contact not updated");
					} 
				} else {
					System.out.println("contact not found");
				}
				break;
			case 4:
				List<Contact> l1= dao.viewAllContacts();
				if(l1!=null) {
					for (Contact contact : l1) {
						System.out.println(contact);
					}
				} else {
					System.out.println("no data");
				}
				break;
			case 5:
				PhoneMain.main(args);
				break;
			default:
				System.out.println("enter valid option");
				break;
			}
		}

	}

}