import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

public class FileInput
{
public static void main(String[] args) {
	try {
		FileInputStream f1 = new FileInputStream("siva.txt");
		int j = 0;
		while((j = f1.read())!=-1) {
			System.out.print((char)j);
		}
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	
}
}
