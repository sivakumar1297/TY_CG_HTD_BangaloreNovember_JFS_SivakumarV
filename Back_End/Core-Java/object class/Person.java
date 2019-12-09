
public class Person
{
String name;

public Person(String name) {
	super();
	this.name = name;
	System.out.println(this.name);
}
@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
