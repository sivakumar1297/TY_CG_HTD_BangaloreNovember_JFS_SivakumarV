
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileop {
public static void main(String[] args) {
	try {
		FileOutputStream f1 = new FileOutputStream("siva.txt");
		
		String s1 = "siva kumar";
		byte b[]=s1.getBytes();
		f1.write(b);
		System.out.println("success---------");
	} catch (IOException e) {
		System.out.println("Exception---");
	}
}
}
