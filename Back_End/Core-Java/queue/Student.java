package com.capgemini.queue.priorityqueue;

public class Student implements Comparable<Student>
{
int age;
String name;
public Student(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + "]";
}
@Override
public int compareTo(Student o) {

	return 1;
}

}
