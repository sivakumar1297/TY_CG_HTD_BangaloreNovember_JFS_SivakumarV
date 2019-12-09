import java.util.function.Predicate;

public class TestA
{
	public static void main(String[] args) {
		Predicate<Integer> p = i-> i%2==0;

		System.out.println( p.test(12));
		System.out.println( p.test(65));

	}
}
