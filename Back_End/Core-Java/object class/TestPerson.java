
public class TestPerson 
{
public static void main(String[] args) throws Throwable {
System.out.println("main start");
	Person p1 = new Person("siva");
	p1.finalize();// 1st method to call finalize
	p1=null;
	System.gc();// 2nd method to call finalize
	System.out.println("main end");
}
}
