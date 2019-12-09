package com.capgemini.forestmanagementsystem.admin;

import java.util.Scanner;

import com.capgemini.forestmanagementsystem.controller.ContractController;
import com.capgemini.forestmanagementsystem.controller.CustomerController;
import com.capgemini.forestmanagementsystem.controller.ProductController;

public class MainPage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("------Welcome To Forest Management System-------");
			System.out.println("Please select the below Option");
			System.out.println("1.Contract");
			System.out.println("2.Customer");
			System.out.println("3.Product");
			System.out.println("4.exit");
			System.out.println("-------------------------------------------------");
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				ContractController obj = new ContractController();
				break;
			case 2:
				CustomerController obj1 = new CustomerController();
				break;
			case 3:
				ProductController obj2=new ProductController();
			case 4:
				System.exit(0);
				
			default:
				System.out.println("invalid");

			}
		}
	}
}
