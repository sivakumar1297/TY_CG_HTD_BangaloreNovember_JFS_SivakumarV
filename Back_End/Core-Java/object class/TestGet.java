

public class TestGet
{
public static void main(String[] args) throws InstantiationException,IllegalAccessException, ClassNotFoundException
{
	GetClass d1 = new GetClass("pinky");
	Class c1= d1.getClass();
	GetClass d2 = (GetClass)c1.newInstance();
	System.out.println(c1);
	System.out.println(d2.name);
	Class c2 = Class.forName("GetClass");
	System.out.println(c2);
}
}
