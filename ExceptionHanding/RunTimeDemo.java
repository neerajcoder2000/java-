package day1;

public class RunTimeDemo {

	public static void main(String[] args) {
		
		int a= 10;
		int b= 0;
		
		 try {
			
		    int c = a/b;
		
		    System.out.println("C: "+c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		

	}

}
