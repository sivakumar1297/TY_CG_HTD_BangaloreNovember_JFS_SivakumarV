import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2
{
public static void main(String[] args) {
	LinkedHashSet<Employee> l1 = new LinkedHashSet<Employee>();
	l1.add(new Employee(23,"siva"));
	l1.add(new Employee(24,"ramu"));
	l1.add(new Employee(23,"siva"));
	l1.add(new Employee(21,"dilip"));
	
	Iterator itr = l1.iterator(); 
	while(itr.hasNext()) {
		System.out.println(itr.next());
}
}
}
