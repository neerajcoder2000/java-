package day1;

public class TryFinally {

	public static void main(String[] args) {
		
		int a= 10;
		int b= 2;
		int d= 0;
		 
		try {
			
			int c= a/b;
			System.out.println("c:"+c);
		}
		finally {
			System.out.println("This is finally block");
			
		}
		try {
			int c=a/d;
			System.out.println("c: "+c);
		}
		catch(Exception e) {
			System.out.println("finally block");
		}
	

	}

}
