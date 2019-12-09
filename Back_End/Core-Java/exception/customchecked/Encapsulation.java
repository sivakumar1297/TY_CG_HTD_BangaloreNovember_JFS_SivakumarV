package com.capgemini.exception.customchecked;

import java.io.Serializable;

public class Encapsulation implements Serializable
{
	 private int age;
	 private String name;
	 public void setAge(int age) {
		 this.age = age;
	 }
	 public int getAge() {
		 return this.age;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getName() {
		 return this.name;
	 }
	 
}
