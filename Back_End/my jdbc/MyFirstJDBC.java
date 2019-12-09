package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//load the driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded.....");
			
			//get connection Via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/capgemini"+"?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("connection estd......");

			//Issue SQL Query Via Connection
			String query = "SELECT * FROM capgemini";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("Query Issued....");
			System.out.println("---------------------------------");
				
			//Process The Result returned
			while(rs.next()){
				System.out.println("userid:"+rs.getInt("userid"));
				System.out.println("username:"+rs.getString("username"));
				System.out.println("email:"+rs.getString("email"));
				System.out.println("-----------------------------------");
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				
					try {
						conn.close();
					    }
						catch (SQLException e) {
						e.printStackTrace();
					}
				}
			if(stmt != null) {
				
				try {
					stmt.close();
				    }
					catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs != null) {
				
				try {
					rs.close();
				    }
					catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		//close all JDBC objects
		}

}
}