package com.capgemini.jdbc.bean;

import java.io.Serializable;

public class UserBean implements Serializable
{
private int userid;
private String username;
private String mail;
private String password;

public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "UserBean [userid=" + userid + ", username=" + username + ", mail=" + mail + "]";
}



}
