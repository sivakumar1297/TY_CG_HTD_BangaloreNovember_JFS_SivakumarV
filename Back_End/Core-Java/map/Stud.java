package com.capgemini.map.hashmap;

public class Stud 
{
int age;
String name;
public Stud(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}

@Override
public String toString() {
	return "Stud [age=" + age + ", name=" + name + "]";
}

//@Override
//public int compareTo(Stud o) {
////	if(this.age>o.age) {
////		return 1;
////	}else if (this.age<o.age) {
////	return -1;
////}else
////{
////	return 0;
////}
//return this.name.compareTo(o.name);
}

