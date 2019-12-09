import java.util.HashSet;

public class HashSet2
{
public static void main(String[] args) {
	HashSet<StudentClass> hs = new HashSet<StudentClass>();
	hs.add(new StudentClass(23, "siva"));
	hs.add(new StudentClass(34,"dilip"));
	hs.add(new StudentClass(14, "pawan"));
	hs.add(new StudentClass(23,"siva"));
	for (StudentClass s1 : hs) {
		System.out.println(s1.name+" and age is"+s1.age);
		
	}
}
}
