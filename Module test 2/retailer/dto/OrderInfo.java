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
@Table(name = "order")
public class OrderInfo {
	@Id
	@Column
	@GeneratedValue
	private int id;
	
	@ManyToOne(targetEntity = ProductInfo.class, fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "Product_id", referencedColumnName = "id")
	@NotNull
	private ProductInfo productinfo;
	
	@Column(name= "Product_id",insertable = false ,updatable = false)
	private int prodid;
	

	@ManyToOne(targetEntity = UserInfo.class, fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "user_id", referencedColumnName = "id")	
	@Column(name= "user_id",insertable = false,updatable = false)
	private int userid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ProductInfo getProductinfo() {
		return productinfo;
	}

	public void setProductinfo(ProductInfo productinfo) {
		this.productinfo = productinfo;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

//	public UserInfo getUserinfo() {
//		return userinfo;
//	}
//
//	public void setUserinfo(UserInfo userinfo) {
//		this.userinfo = userinfo;
//	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", productinfo=" + productinfo + ", prodid=" + prodid 
				+ ", userid=" + userid + "]";
	}

	

	



}
