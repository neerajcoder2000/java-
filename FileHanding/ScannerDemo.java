package Day1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("MyFile.txt");
			
			Scanner scan=new Scanner(fr);
			
			
			while(scan.hasNext()) {
				
				if(scan.hasNext()) {
					System.out.println(scan.nextInt());
				}
				else {
					if(scan.hasNext()) {
						scan.next();
					}
				}
			
			}
		
			/*
			while(scan.hasNext()) {
				String pattern=scan.findInLine("good");
				
				if(pattern!=null) {
					System.out.println(pattern);
					System.out.println("pattern Found Successfully");
				}
				else {
					scan.nextLine();
				}
			}
			
			*/
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
