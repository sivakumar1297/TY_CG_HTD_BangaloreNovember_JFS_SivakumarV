
public class Demo1
{
public static void main(String[] args) {
	String s1 = new String("siva");
   System.out.println(s1.hashCode());
   
	String s2 = new String("jiva");
	String s3 = new String("siva");
	s1= new String("pavan");
	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
	   System.out.println(s3.hashCode());

}
}
