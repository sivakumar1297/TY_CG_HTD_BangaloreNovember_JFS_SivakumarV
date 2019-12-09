package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyFirst 
{
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	Driver driver;
	
	
	
	try {
		driver = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver loaded------");
		//GET DB CONNECTION
		String dbUrl="jdbc:mysql://localhost:3306/capgemini";
		System.out.println("enter username and password");
		String dbUser= sc.nextLine();
		String dbPass = sc.nextLine();
		conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
		System.out.println("connection estd----------");
		//Issue SQL query3
		String query = "select * from capgemini where userid= ?  and password=?";
		pstmt = conn.prepareStatement(query);
		System.out.println("Enetr user id------");
		 pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
		 System.out.println("Enter Password-----");
		  pstmt.setString(2,sc.nextLine());
		 rs= pstmt.executeQuery();
		
		System.out.println("Query issued--------");
		if(rs.next()) {
			System.out.println("userid:"+rs.getInt("userid"));
			System.out.println("username:"+rs.getString("username"));
			System.out.println("Email:"+rs.getString("Email"));
			System.out.println("****************************");
		}	
	} catch (SQLException e) {
		e.printStackTrace();
	}
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
		if(rs!=null) {
			try {
			rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

private static void setString(int i, String nextLine) {
	// TODO Auto-generated method stub
	
}
}
