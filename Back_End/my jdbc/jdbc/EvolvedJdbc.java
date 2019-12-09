package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EvolvedJdbc
{
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
String dbUrl="jdbc:mysql://localhost:3306/capgemini";
System.out.println("enter username and password");
String dbUser= sc.nextLine();
String dbPass = sc.nextLine();
String query = "select * from capgemini";
try(Connection	conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
Statement stmt = conn.createStatement();
		ResultSet rs =stmt.executeQuery(query)){
	while(rs.next()) {
		System.out.println("userid:"+rs.getInt("userid"));
		System.out.println("username:"+rs.getString("username"));
		System.out.println("Email:"+rs.getString("Email"));
		System.out.println("****************************");
	}
	sc.close();
} catch (SQLException e) {
	e.printStackTrace();
}
}
}
