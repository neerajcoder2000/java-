
public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();
		
		//Length
		System.out.println(s.length());
		
		//Capacity
		System.out.println(s.capacity());
		
		
		StringBuffer s1 = new StringBuffer("Andheri");
		
		//length
		System.out.println(s1.length());
		
		//Capacity
		System.out.println(s1.capacity());  //(oldcapacity*2)+2
		                                    //(oldcapacity+1)*2
		
		//append
		s1.append("Andheri");
		System.out.println(s1);
		System.out.println(s1.capacity());
		
		//insert
		s1.insert(5," Technology");
		System.out.println(s1);
		
		System.out.println(s1.capacity());
		
		//delete
		//s1.delete(2, 5);
		//System.out.println(s1);
		
		//reverse
		//s1.reverse();
		//System.out.println(s1);
		
		// deleteCharAt
		s1.deleteCharAt(5);
		System.out.println(s1);
		
		//replace
		s1.replace(0, 17, "Squad Infotech");
		System.out.println(s1);
		
		// CharAt
		char ch = s1.charAt(3);
		System.out.println(ch);
		
		//set charAt
		s1.setCharAt(2, 'r');
		System.out.println(s1);
		
		

	}

}
