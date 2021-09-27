package day1;

public class FinallyDemo {

	public static void main(String[] args) {
		
		int a= 20;
     	int b= 0;
		
		try {
			int c= a/b;
			System.out.println("c: "+c);
			
		}
		catch(Exception e) {
			System.out.println("You cannot divide by zero"+e);
		}
		
		finally {
			System.out.println("This is finally block");
		}
		
	}

}
