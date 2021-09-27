package Day1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		
		try {
			
			//print in file
			FileWriter fw= new FileWriter("MyFile.txt");
			
			PrintWriter pw=new PrintWriter(fw);
			
			pw.write("Hello");
			
			pw.write('\n');
			
			pw.println("Welcome");
			pw.print("Hi");
			
			pw.close();
			
			System.out.println("File Written Succssfully");
			
			//print in console
			PrintWriter pw1=new PrintWriter(System.out);
			pw1.write("Hello Everyone!!!!!!!!!");
			pw1.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
