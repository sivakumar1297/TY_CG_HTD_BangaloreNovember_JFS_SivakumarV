import java.util.Vector;

public class Vector1 
{
public static void main(String[] args) {
	Vector v1 = new Vector();
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	v1.addElement(61);
	v1.addElement(37);
	v1.addElement(87);
	v1.addElement(32);
	v1.removeElement(new Integer(37));
	System.out.println(v1);
	v1.set(1, 86);
	System.out.println(v1);
	for(Object i: v1) {
		System.out.println(i);
	}
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	v1.trimToSize();
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	v1.setSize(10);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	v1.add(43);
	System.out.println(v1.size());
	System.out.println(v1);
	v1.set(6, 987);
	System.out.println(v1);
     Object o[] = new Object[v1.size()];
     v1.copyInto(o);
     for(int i = 0; i<o.length;i++)
     {
    	 System.out.println(o[i]);
     }
     Vector v2 = new Vector();
     v2.addElement(45);
     v2.addElement(86);
     System.out.println(v2.size());
     System.out.println(v2.capacity());
     v2.trimToSize();

     System.out.println(v2.size());
     System.out.println(v2.capacity());
     v2.ensureCapacity(6);
     System.out.println(v2.capacity());
     v2.setSize(8);

     System.out.println(v2.size());
     System.out.println(v2.capacity());
     System.out.println(v2);
}

}
