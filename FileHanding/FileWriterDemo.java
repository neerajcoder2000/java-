package Day1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		try {
			FileWriter fw= new FileWriter("File1.txt",true);
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter some txt.....");
			String s=scan.nextLine();
			
			fw.write(s);
			
			fw.append("squad");
			
			fw.flush();
			fw.close();
			System.out.println("File Written successfully");
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
