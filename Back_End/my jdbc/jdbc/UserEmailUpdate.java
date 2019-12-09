package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pstmt = null;
	//load the Driver
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver loaded------------------");
		
		//get the DB connection
		
		String dburl = "jdbc:mysql://localhost:3306//capgemini";
		System.out.println("Enter DB user and password");
		String user = sc.nextLine();
		String password = sc.nextLine();
		conn = DriverManager.getConnection(dburl,user,password);
		System.out.println("Connection Estd------------------");
		 
		//Issue SQL Query
		
		String query = "update capgemini set email = ?"+ "where userid = ? and password = ? ";
		pstmt = conn.prepareStatement(query);
		System.out.println("Enter userid--------------------");
		pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the new email----------------");
		pstmt.setString(1, sc.nextLine());
		System.out.println("enter the password------------------");
		pstmt.setString(3,sc.nextLine());
		int count = pstmt.executeUpdate();
		System.out.println("Query has been Issued-------------");
		
		//Process the result
		
		if(count>0) 
		{
			System.out.println("Query OK"+count+"Rows affected");
		}else
		{
			System.err.println("something went wrong--------------");
		}
		
		sc.close();
	} catch (Exception e)
	  {
		
		e.printStackTrace();
	  }
	//close all the JDBC Objects
	finally {
		if(conn!=null) {
			try {
			conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt!=null) {
			try {
			pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	
	}
}
}
