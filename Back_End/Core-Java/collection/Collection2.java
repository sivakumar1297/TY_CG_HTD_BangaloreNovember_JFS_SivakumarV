import java.util.ArrayList;
import java.util.Collection;

public class Collection2 
{
public static void main(String[] args) {
	Collection c = new ArrayList();
	c.add(84);
	c.add(96);
	System.out.println(c);
	Collection c1 = new ArrayList();
	c1.add(56);
	c1.add(96);
	c1.add(84);
	c1.add(21);
	c1.retainAll(c);
	System.out.println(c1);
	System.out.println(c1);
	c.addAll(c1);
	System.out.println(c);
	
	System.out.println(c.containsAll(c1));
	
	c.clear();
	System.out.println(c);
	System.out.println(c1);
  Object a[]= c1.toArray();
   for(int i =0; i<a.length; i++)
   {
	   System.out.println(a[i]);
   }
	
	
}
}
