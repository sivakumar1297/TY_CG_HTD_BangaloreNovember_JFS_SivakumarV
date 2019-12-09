import java.util.function.*;

public class Testc1
{
public static void main(String[] args) {
	Supplier<Testc> s = () -> new Testc(23,"siva");
	System.out.println(s.get().getAge());
	System.out.println(s.get().getName());
	
	System.out.println("------------------------------------------");
	Consumer<Testc> c = j -> {
		System.out.println(j.getAge());
		System.out.println(j.getName());
	};
	Testc t = new Testc(23,"pawan");
	c.accept(t);
	
	
}
}
