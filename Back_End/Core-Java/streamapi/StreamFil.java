import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFil 
{
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(24);
	a.add(27);
	a.add(32);
	a.add(25);
	a.add(28);
	a.add(29);
	
	
	List <Integer>l1 =a.stream().filter(i -> i%2!=0).collect(Collectors.toList());
	System.out.println(l1);
	
	List <Integer>l2 = a.stream().filter(i -> i%2==0).collect(Collectors.toList());
	System.out.println(l2);
	
	List <Integer>l3 = a.stream().map(i -> i*100).collect(Collectors.toList());
	System.out.println(l3);
	
	Optional <Integer> o = a.stream().max((i,j)->i.compareTo(j));
	System.out.println(o);
	System.out.println(a.stream().count());
}
}
