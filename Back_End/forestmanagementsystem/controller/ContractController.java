package com.capgemini.forestmanagementsystem.controller;

import java.util.Scanner;

import com.capgemini.forestmanagementsystem.factory.ContractFactory;
import com.capgemini.forestmanagementsystem.services.ContractServices;
import com.capgemini.forestmanagementsystem.bean.Contract;

public class ContractController {
	public ContractController() {
		ContractServices services = ContractFactory.instanceOfContaractServicesImpl();
		Scanner in = new Scanner(System.in);
		char ch = 'y';
		while ((ch == 'y') || ch == 'Y') {
			System.out.println("------------Welcome contract---------");
			System.out.println("1 Add the contract");
			System.out.println("2.delete the contract");
			System.out.println("3.Display the contract");
			System.out.println("4.Access specify user");
			System.out.println("enter the choice");
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				Contract con = new Contract();
				System.out.println("Enter the Contract number");
				con.setContract_no(in.nextInt());
				System.out.println("Enter the Customer Id");
				con.setCustomer_id(in.nextInt());
				System.out.println("Enter the Product id");
				con.setProduct_id(in.nextInt());
				System.out.println("Enter the Hauilder id");
				con.setHaulier_id(in.nextInt());
				System.out.println("Enter the Deliver date(dd-mm-yyyy)");
				con.setDelivery_date(in.next());
				System.out.println("Enter the Deliver day");
				con.setDelivery_day(in.next());
				System.out.println("Enter the quantity");
				con.setQuality(in.nextInt());
				if (services.addContract(con)) {
					System.out.println("Sucessfully Added");
				} else {
					System.err.println("Already present");
				}
				break;
			case 2:
				Contract con1 = new Contract();
				System.out.println("enter the number");
				con1.setContract_no(in.nextInt());
				if (services.deleteContact(con1.getContract_no()))
					System.out.println("sucessfully deleted");
				else
					System.err.println("Error");
				break;
			case 3:
				System.out.println(services.contractDetail());
				break;
			case 4:
				System.out.println("Enter the contract number");
				int contract_no = in.nextInt();
				Contract con2 = services.search(contract_no);
				System.out.println(con2);
				break;
			default:
				System.out.println("plz enter the above choices");
			}
			System.out.println("--------------");
			System.out.println("DO U WANT TO COUNTINUE Y/N?");
			ch = in.next().charAt(0);
		}

	}
}
