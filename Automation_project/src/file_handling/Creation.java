package file_handling;

import java.io.File;
import java.io.IOException;

public class Creation {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\liger");
		
		f.mkdir();
		System.out.println("folder created");
		
		File f1 = new File("D:\\liger\\Vijay.txt");
		
		f1.createNewFile();
		
		System.out.println("file created!!!");
		
		f1.delete();
	}
}
