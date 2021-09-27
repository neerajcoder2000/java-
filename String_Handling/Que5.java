
public class Que5 {

	public static void main(String[] args) {
		
		String s = "Hello World";
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println(s.charAt(i));
				
				count++;
				
			}
		}
		System.out.println("count: "+count);
	}

}
