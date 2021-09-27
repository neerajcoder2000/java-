
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder();
		System.out.println(s.capacity());
		
		StringBuffer s1 = new StringBuffer("CoderTechnology at");
		int p = s1.length();
		System.out.println("p: "+p);
		
		int q = s1.capacity();
		System.out.println("q: "+q);
			
		s1.append(" Java");
		System.out.println(s1);
		
		s1.insert(5, "For");
		System.out.println(s1);
		
		
		//reverse , delete, deleteCharAt ,replace
	
		//s1.reverse();
		//System.out.println(s1);
		
		//s1.delete(2, 5);
		//System.out.println(s1);
		
		s1.deleteCharAt(5);
		System.out.println(s1);
		
		s1.replace(0, 16, "Neeraj Sharma");
		System.out.println(s1);
	}

}
