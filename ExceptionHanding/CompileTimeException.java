package day1;

import java.io.FileInputStream;

public class CompileTimeException {

	public static void main(String[] args) {
		
		try {
		
		FileInputStream fs =new FileInputStream("abc.txt");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
