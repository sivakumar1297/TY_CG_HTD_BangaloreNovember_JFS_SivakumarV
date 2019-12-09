package com.capgemini.forestmanagementsystem.controller;

import java.util.Scanner;

import com.capgemini.forestmanagementsystem.factory.CustomerFactory;
import com.capgemini.forestmanagementsystem.services.CustomerService;
import com.capgemini.forestmanagementsystem.bean.Customer;

public class CustomerController {
	public CustomerController() {
		CustomerService service = CustomerFactory.instanceOfCustomerServicesImpl();
		Scanner in = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		while ((ch == 'y') || ch == 'Y') {
			System.out.println("---------Welcome Customer-------------");
			System.out.println("1 Add the Customer");
			System.out.println("2.Detele Customer");
			System.out.println("3.Display the Customer");
			System.out.println("4.Access specify cutsomer");
			System.out.println("5.modify");
			System.out.println("enter the choice");
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				Customer cus= new Customer();
				System.out.println("Enter the customer id");
				cus.setCustomer_id(in.nextInt());
				System.out.println("Enter the name");
				cus.setCustomer_name(sc.nextLine());
				System.out.println("Enter the street address1");
				cus.setAddress1(sc.nextLine());
				System.out.println("Enter the street address2");
				cus.setAddress2(sc.nextLine());
				System.out.println("Enter the town");
				cus.setTown(in.next());
				System.out.println("enter postalcode");
				cus.setPostal_code(in.nextInt());
				System.out.println("enter the email");
				cus.setEmail(in.next());
				System.out.println("Enter Telephone number");
				cus.setTelephone_no(sc.nextInt());
				if (service.addCustomer(cus)) {
					System.out.println("Added");
				} else {
					System.err.println("Customer already exist");
				}
				break;
			case 2:
				Customer cus1 = new Customer();
				System.out.println("enter the customer_id");
				cus1.setCustomer_id(in.nextInt());
				if (service.deleteCustomer(cus1.getCustomer_id())) {
					System.out.println("deleted");
				} else {
					System.err.println("Error");
				}
				break;
			case 3:
				System.out.println(service.customerDetail());
				break;
			case 4:
				System.out.println("Enter the Customer number");
				int customer_id = in.nextInt();
				Customer custObj = service.search(customer_id);
				System.out.println(custObj);
				break;
			case 5:
				System.out.println("Enter the customer id");
				int customer_id1 = in.nextInt();
				System.out.println("what u want to modify");
				System.out.println("1.name");
				System.out.println("2.Address1");
				System.out.println("3.Address2");
				System.out.println("4.Town");
				System.out.println("5.code");
				System.out.println("6.email");
				System.out.println("7 telphone");
				System.out.println("enter the choice");
				int choice1 = in.nextInt();
				switch (choice1) {
				case 1:
					System.out.println("enter the name");
					String name = sc.next();
					if (service.modify(customer_id1, name)) {
						System.out.println("name is modified");
					} else {
						System.err.println("Error");
					}
					break;
				case 2:
					System.out.println("Enter the address");
					String address1 = sc.next();
					if (service.modifyadd1(customer_id1, address1)) {
						System.out.println("address is modofied");
					} else {
						System.err.println("error");
					}
					break;
				case 3:
					System.out.println("Enter the address");
					String address2 = sc.next();
					if (service.modifyaddr2(customer_id1, address2)) {
						System.out.println("address is modofied");
					} else {
						System.err.println("error");
					}
					break;
				case 4:
					System.out.println("Enter the town");
					String town = sc.next();
					if (service.modifytown(customer_id1, town)) {
						System.out.println("town is modofied");
					} else {
						System.err.println("error");
					}
					break;
				case 5:
					System.out.println("Enter the code");
					int code1 = in.nextInt();
					if (service.modifycode(customer_id1, code1)) {
						System.out.println("sucessfully");
					} else {
						System.err.println("failed");
					}
					break;
				case 6:
					System.out.println("Enter the email");
					String email1 = sc.next();
					if (service.modifyemail(customer_id1, email1)) {
						System.out.println("sucessfully");
					} else {
						System.err.println("failed");
					}
					break;
				case 7:
					System.out.println("Enter the telphone");
					int telphone1 = in.nextInt();
					if (service.modifytelphone(customer_id1, telphone1)) {
						System.out.println("sucessfully");
					} else {
						System.err.println("failed");
					}
					break;
				default:
					System.out.println("invalid");
				}
				break;
			default:
				System.out.println("Please select the Above choice");
			}
			System.out.println("---------------------------------");
			System.out.println("Do u want to Countinue y/n?");
			ch = in.next().charAt(0);
		}
	}
//
//	public static CustomerController instanceofCustomerController()
//	{
//		if(custObj==null)
//			custObj=new CustomerController();
//		return custObj;
//		
//	}
}
