
public class WrapperDemo2 {

	public static void main(String[] args) {
		
		//Wrapper to Primitive
		
		Integer a = new Integer(3);
		
		int i = a.intValue();
		
		//Wrapper to primitive autowrapping
		int j =a;

		System.out.println(a+" "+i+" "+j);
	}

}
