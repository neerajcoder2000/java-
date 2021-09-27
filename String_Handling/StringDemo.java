
public class StringDemo {

	public static void main(String[] args) {
		
		//way 1
		String s = new String();
		
		// way2
		String s1 = new String("Hello");
		
		// way 3
		char ch[] = {'c','o','d','e','r'};
		String s2 = new String(ch);
		
		// way4
		String s3 = new String(s1);
		
		// way5
		String s4 = "Hello World";
		
		System.out.println("s: "+s);
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		
		
		
	}

}
