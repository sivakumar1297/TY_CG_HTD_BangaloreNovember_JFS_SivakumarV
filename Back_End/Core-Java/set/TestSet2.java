import java.util.Iterator;
import java.util.TreeSet;

public class TestSet2 
{
public static void main(String[] args) {
	StudentAge s2 = new StudentAge();
	StudentName s3 = new StudentName();
	TreeSet<Student> t1 = new TreeSet<Student>(s3);
	t1.add(new Student(23,"siva"));
	t1.add(new Student(34,"ramu"));
	t1.add(new Student(32,"peter"));
	t1.add(new Student(19,"john"));
	t1.add(new Student(34,"ramu"));
for (Student s1 : t1) {
	System.out.println("name is  "+s1.name);
	System.out.println("age is   "+s1.age);
}
	 }
}

