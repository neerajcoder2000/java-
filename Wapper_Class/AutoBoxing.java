package day1;

public class AutoBoxing {

	public static void main(String[] args) {
		
		int a =10;
		
		Integer i=Integer.valueOf(a); // Converting int to Integer
		
		Integer j=i;  // automatically write integer.valueOf(a) in j
		
		System.out.println(a+ " "+i+" "+j);

	}

}
