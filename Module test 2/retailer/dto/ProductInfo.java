package com.capgrmini.retailer.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class ProductInfo {
	@Id
	@Column
	@GeneratedValue
private int id;
	@ManyToOne(targetEntity = UserInfo.class,fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
	@JoinColumn(name = "user_id",referencedColumnName = "id")
//	@NotNull
//	private UserInfo userinfo;
	@Column(name = "user_id",insertable = false,updatable = false)
	private int useid;
	
	@Column(unique=true)
	private String name;
	@Column
private	 int quantity;
	@Column
	private String details;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public UserInfo getUserinfo() {
//		return userinfo;
//	}
//	public void setUserinfo(UserInfo userinfo) {
//		this.userinfo = userinfo;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ProductInfo [id=" + id +  ", name=" + name + ", quantity=" + quantity
				+ ", details=" + details + "]";
	}
	
}
