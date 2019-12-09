
public class Student implements Comparable<Student>
{
int age;
String name;
public Student(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
@Override
public int compareTo(Student o) {
//  if(this.age >o.age)
//  {
//	  return 1;
//  } else if(this.age<o.age) {
//	return -1;
//}else {
//	return 0; // sorting based on age
	return this.name.compareTo(o.name);// sorting based on name
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + "]";
}
}
