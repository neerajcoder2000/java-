package Day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		try {
			FileOutputStream fos = new FileOutputStream("abc.txt",true);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("enter  some text.......");
			String s=scan.nextLine();
			
		//	fos.write('\n');
			fos.write(0);
			fos.write(s.getBytes());
			
			System.out.println("File Written succesfully");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
