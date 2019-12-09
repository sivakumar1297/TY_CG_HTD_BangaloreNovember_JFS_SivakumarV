
public interface Bottle
{
 void open();
 void drink();
default void drink1()
{
	System.out.println("drink");
}
static void close()
{
	System.out.println("close the bottle");
}
 
}
