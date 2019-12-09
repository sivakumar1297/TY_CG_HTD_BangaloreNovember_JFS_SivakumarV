package com.capgemini.forestmanagementsystem.controller;

import java.util.Scanner;

import com.capgemini.forestmanagementsystem.bean.Product;
import com.capgemini.forestmanagementsystem.factory.ProductFactory;
import com.capgemini.forestmanagementsystem.services.ProductServices;

public class ProductController {
	public ProductController() {
		ProductServices services = ProductFactory.instanceOfProductServicesImpl();
		Product pro = new Product();
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		while ((ch == 'y') || ch == 'Y') {
			System.out.println("------------Welcome product---------");
			System.out.println("1 Add the product");
			System.out.println("2.delete the Product");
			System.out.println("3.modify product name");
			System.out.println("4.modify product date");
			System.out.println("5. search product");
			System.out.println("6. Get all product info");
			System.out.println("Enter the Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the ProductId");
				pro.setProdid(sc.nextInt());
				System.out.println("Enter the Productname");
				pro.setProduct_name(sc.next());
				System.out.println("Enter the Productdate");
				pro.setProduct_date(sc.next());
				if (services.addproduct(pro)) {
					System.out.println("Added Successfully");
				} else {
					System.out.println("Something Went Wrong");
				}
				break;

			case 2:
				System.out.println("Enter the ProductId to delete");
				pro.setProdid(sc.nextInt());
				if (services.deleteProduct(pro.getProdid())) {
					System.out.println("Delete Successfully");
				} else {
					System.out.println("Something Went Wrong");
				}
				break;
			case 3:
				System.out.println("Enter Product_Id to alter");
				pro.setProdid(sc.nextInt());
				System.out.println("Enter the ProductName");
				pro.setProduct_name(sc.next());
				if (services.modifyProductName(pro.getProdid(), pro.getProduct_name())) {
					System.out.println("Updated Successfully");
				} else {
					System.out.println("Something Went Wrong");
				}
				break;
			case 4:
				System.out.println("Enter productId to alter the Date");
				pro.setProdid(sc.nextInt());
				System.out.println("Enter the ProductDate");
				pro.setProduct_date(sc.next());     
				if (services.modifyProductDate(pro.getProdid(), pro.getProduct_date())) {
					System.out.println("Updated Successfully");
				} else {
					System.out.println("Something Went Wrong");
				}
				break;
			case 5: System.out.println("Enter ProductId to find");
			pro.setProdid(sc.nextInt());
			System.out.println(services.searchProduct(pro.getProdid()));
               break;
			case 6: System.out.println(services.getAllProduct()); 
			break;
			}
		}
		System.out.println("do you want to continue y/n");
		ch = sc.next().charAt(0);
	}
}
