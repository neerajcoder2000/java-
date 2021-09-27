
public class ComparisionDemo {

	public static void main(String[] args) {
		
		String s = new String("CODER");
		String s1 = new String("coder");
		String s2 = new String("oder");
		String s3 = new String("Coder");
		String s4 = "coder";
		String s5 = "coder";
		String s6 = s;
		
		
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s4==s5);
		System.out.println(s==s6);
		
		System.out.println("-------------------------");
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		
		System.out.println("---------------------------");
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		System.out.println("---------------------------");
		System.out.println(s.compareTo(s1));
		System.out.println(s1.compareTo(s));
		//System.out.println(s1.compareTo(s2));
		
		System.out.println("-----------------------------");
		System.out.println(s.compareToIgnoreCase(s1));
	
		
		
	}

}
