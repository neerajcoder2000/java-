package day1;

import java.io.IOException;

public class ChainedException {

	public static void main(String[] args) {
		
		try {
			int a=10;
			int b=0;
			int c=a/b;
			
			System.out.println("c: "+c);
			
		}
		catch(Exception e) {
			
			//e.printStackTrace();
			
			//Way1
			/*
			 * IOException i= new IOException(); e.initCause(i);
			 * 
			 * System.out.println(e.getCause());
			 * 
			 */
			
			//Way2
			
			e.initCause(new IOException());
			System.out.println(e.getCause());

	}

}
	
}

