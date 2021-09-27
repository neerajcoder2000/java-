package day1;

public class UnBoxing {

	public static void main(String[] args) {
		
		Integer i = new Integer(3);
		
		int a=i.intValue(); // coverting Integer to int
		
		int b=a;   // Unboxing compiler with write i.intValue() internally
		
		System.out.println(i+" "+a+" "+b);

	}

}
