package day1;

import java.io.IOException;

public class ExceptionMethods {

	public static void main(String[] args) {
		
		try {
			int a=10,b=0;
			
			int C= a/b;
			System.out.println("c: "+C);
		}
		catch(ArithmeticException e) {
			//System.out.println(e);
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			//System.out.println(e.fillInStackTrace());
			//e.printStackTrace();
			
			//way1
			//IOException i=new IOException();
			//e.initCause(i);
			
			//System.out.println(e.getCause());
			
			//way2
			e.initCause(new IOException());
			System.out.println(e.getCause());
		}
		
	}

}


