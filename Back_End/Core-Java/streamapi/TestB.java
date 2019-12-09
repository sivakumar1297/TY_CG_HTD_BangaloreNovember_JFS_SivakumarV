import java.util.function.Function;

public class TestB
{
public static void main(String[] args) {
	Function<Integer,Integer> f = a -> a*100;
	int a1 = f.apply(34);
	System.out.println(a1);
}
}
