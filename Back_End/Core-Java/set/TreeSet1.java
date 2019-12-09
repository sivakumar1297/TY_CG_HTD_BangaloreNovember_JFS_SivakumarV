import java.util.TreeSet;

public class TreeSet1 
{
public static void main(String[] args) {
	TreeSet t1 = new TreeSet();
	t1.add(34);
	t1.add(56);
	t1.add(23);
	t1.add(32);
	t1.add(56);
//	t1.add(null); null value is not allowed
//	t1.add("siva"); heterogeneous values is not allowed
	for (Object object : t1) 
	{
		System.out.println(object);
	}
}
}
