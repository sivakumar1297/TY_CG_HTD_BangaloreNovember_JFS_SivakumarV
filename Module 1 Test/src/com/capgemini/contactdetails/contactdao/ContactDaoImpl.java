package com.capgemini.contactdetails.contactdao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.contactdetails.admin.Contact;
import com.capgemini.contactdetails.bean.ContactBean;

public class ContactDaoImpl implements ContactDao {

	FileReader reader;
	Properties prop;
	Contact con;

	
	public ContactDaoImpl() {
		try {
			reader = new FileReader("contact.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("hi");
		}
	}
	
	@Override
	public List<ContactBean> showAllContact(){
		List<ContactBean> l1= new ArrayList<ContactBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("name"), 
				prop.getProperty("password"));
				Statement stmt=conn.createStatement()){
			ResultSet rs=stmt.executeQuery(prop.getProperty("select"));
			while(rs.next()) {
				ContactBean con=new ContactBean();
				con.setName(rs.getString(1));
				con.setNumber(rs.getInt(2));
				con.setGroupCategory(rs.getString(3));
				l1.add(con);
			} 
			return l1;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

	@Override
	public boolean insertContact(String name) {
		ContactBean con = new ContactBean();

		try(Connection conn=DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("name"), 
				prop.getProperty("password"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insert"))){

			pstmt.setString(1, con.getName());
			pstmt.setInt(2, con.getNumber());
			pstmt.setString(3, con.getGroupCategory());

			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			} else {
				return false;
			}

		} catch(Exception e) {
			System.out.println("duplicate name not allowed");
		}

		return false;
	}

	@Override
	public boolean deleteContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("name"), 
				prop.getProperty("password"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("delete"))){

			pstmt.setString(1,name);

			int r=pstmt.executeUpdate();
			if(r>0) {
				return true;
			} else {
				return false;
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("name"), 
				prop.getProperty("password"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("modify"))){
			
			pstmt.setString(1,name);
			int r=pstmt.executeUpdate();
			if(r>0) {
				return true;
			} else {
				return false;
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	

	@Override
	public ContactBean searchContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), 
				prop.getProperty("pass"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("search"))){
			pstmt.setString(1,name);
			ResultSet rs= pstmt.executeQuery();
			if(rs.next()) {
			ContactBean con=new ContactBean();
			con.setNumber(rs.getInt("Number"));
			con.setGroupCategory(rs.getString("GroupCategory"));
			return con;
			} else {
				return null;
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

