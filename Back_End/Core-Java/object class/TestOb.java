
public class TestOb {
	public static void main(String[] args) {
		Em e1=new Em(222,"anu");
		Em e2=new Em(222,"anu");
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}

}
