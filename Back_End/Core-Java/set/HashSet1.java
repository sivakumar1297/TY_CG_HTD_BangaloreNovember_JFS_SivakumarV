import java.util.HashSet;
import java.util.Iterator;

public class HashSet1
{
public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add(45);
	hs.add(24);
	hs.add(67);
	hs.add(98);
	hs.add(null);
	hs.add(null);
	for (Object object : hs) {
		System.out.println(object);
	}
	HashSet<String> hs1 = new HashSet<String>();
	hs1.add("shiva");
	hs1.add("dilip");
	hs1.add("pawan");
	
	for (String object : hs1) {
		System.out.println(object.hashCode());
		System.out.println(object);
	}
}
}
