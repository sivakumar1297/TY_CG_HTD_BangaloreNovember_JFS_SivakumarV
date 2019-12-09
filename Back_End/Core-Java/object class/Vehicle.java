
public class Vehicle implements Cloneable
{
String Vehiclename;

public Vehicle(String vehiclename) {
	super();
	this.Vehiclename = vehiclename;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
