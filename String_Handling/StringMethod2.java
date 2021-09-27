
public class StringMethod2 {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = new String("java");
		String s3 = "JAVA";
		String s4 = "rose is red";
		String s5 = "rose is red,blood is red";
		
		//intern
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		
		String s6=s2.intern();
		System.out.println(s1==s6);
		
		//content Equals
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.contentEquals(s3));
		System.out.println(s4.contentEquals(s5));
		
		//copyValueOf
		char[] ch= {'C','o','d','e','r','T','e','c','h','n','o','l','o','g','y'};
		String str = String.copyValueOf(ch,7,3); 
		System.out.println(str);
		
		//indexOf
		System.out.println(s1.indexOf('a'));
		System.out.println(s4.indexOf('o'));
		System.out.println(s5.indexOf('o', 2));
		
		//LastiIndexOf
		System.out.println(s5.lastIndexOf('r'));
		System.out.println(s5.lastIndexOf('r', 20));

		//Split
		String[] str1 =s5.split(" ");
		
		for(String a:str1) {
			
		System.out.println(a);
		}
		System.out.println("---------------------");
		
		//split
		String[] str2 = s5.split(" ",2);
		
		for(String a:str2) {
			System.out.println(a);
		}
		
		System.out.println("-----------------------------");
		
		//Trim
		String str3="              Hello World                 ";
		System.out.println(str3.trim());
		
		
		
		
	}

}
