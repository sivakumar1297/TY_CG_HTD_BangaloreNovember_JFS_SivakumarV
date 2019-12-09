import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1
{
public static void main(String[] args) {
	LinkedHashSet l1 = new LinkedHashSet();
	l1.add(45);
	l1.add(54);
	l1.add(83);
	l1.add(null);
	l1.add(45);
	l1.add(23);
	l1.add(93);
	l1.add(null);
	Iterator itr = l1.iterator(); 
	while(itr.hasNext()) {
		System.out.println(itr.next());

	}
	System.out.println("-----------------------------------");
	LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
	l2.add(45);
	l2.add(54);
	l2.add(83);
	l2.add(null);
	l2.add(45);
	l2.add(23);
	l2.add(93);
	l2.add(null);
	Iterator itr1 = l1.iterator(); 
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
}
}
}
