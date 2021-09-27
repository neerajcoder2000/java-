
public class StringMethod {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "java";
		String s3 = "JAVA";
		String s4 = "rose is red";
		String s5 = "rose is red,blood is red";
		
		//char charAt(int index)
		System.out.println(s1.charAt(0));
		
		// concat
		System.out.println(s1.concat(s2));
		
		//boolean endsWith(String str)
		System.out.println(s4.endsWith("red"));
		
		//startwith(String str)
		System.out.println(s4.startsWith("rose"));
		
		//Length()
		System.out.println(s1.length());
		System.out.println(s4.length());
		
		int len = s1.length();
		System.out.println(len);
		
		//Replace (old char,new char)
		System.out.println(s4.replace('r', 'o'));
		System.out.println(s5.replace("red", "blue"));
		System.out.println(s5.replaceFirst("red", "blue"));
		
		//toUpperCase
		System.out.println(s1.toUpperCase());
		System.out.println(s4.toUpperCase());
		
		//toLowerCase
		System.out.println(s3.toLowerCase());
		
		//subString(2)
		System.out.println(s4.substring(2));
		System.out.println(s4.substring(2, 8));
		

	}

}
