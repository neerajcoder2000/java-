
public class StringDemo2 {

	public static void main(String[] args) {
		
		String s1 = new String("Java");
		String s2 = new String(s1);
		
		if(s1==s2) {
			System.out.println("true");
		}
		
		else {
			System.out.println("False");
		}
		
		String s3 = "CODER";
		String s4 = "CODER";
		if(s3==s4) {
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}

	}

}
