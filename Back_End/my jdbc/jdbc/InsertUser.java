package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser
{

public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Connection conn = null;
			PreparedStatement pstmt = null;
	try {
		//load the driver
		Driver driver = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver Loaded---------");
		//Get the DB connection
			String dbUrl = "jdbc:mysql://localhost:3306/capgemini";
			System.out.println("Enter DB user and password");
			String dbuser = sc.nextLine();
			String dbpass = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl,dbuser,dbpass);
			System.out.println("Connection Estd---------");
		//Issue SQL Query
			String query = "insert into capgemini values(?,?,?,?)";			
		pstmt = conn.prepareStatement(query);

			System.out.println("Enetr user id------");
			 pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			 System.out.println("Enter username-----");
			  pstmt.setString(2,sc.nextLine());

				 System.out.println("Enter email-----");
				  pstmt.setString(3,sc.nextLine());

					 System.out.println("Enter Password-----");
					  pstmt.setString(4,sc.nextLine());
					 
						 int count = pstmt.executeUpdate();
			 if(count>0) {
				 System.out.println("User added-------");
			 }else {
				 System.err.println("Something went wrong--------");
			 }
		//process the results returned
		//close all the JDBC objects

		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}

}
