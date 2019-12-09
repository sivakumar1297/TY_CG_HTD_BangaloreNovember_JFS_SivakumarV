import java.util.ArrayList;
import java.util.Collection;

public class Collection1 
{
public static void main(String[] args) {
	Collection c1 = new ArrayList();
	c1.add(12);
	c1.add(56);
	System.out.println(c1.contains(45));
	System.out.println(c1);
	c1.remove(56);
	System.out.println(c1.isEmpty());
	c1.add(78);
	System.out.println(c1.size());
	System.out.println(c1);
}
}
