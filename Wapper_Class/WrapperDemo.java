
public class WrapperDemo {

	public static void main(String[] args) {
		//wrapper class in java
		
		int a = 12;  //primitive
		
		Integer j=a;  //autoboxing : autowrapping
		
		//primitive to object : boxing oop
		Integer i = Integer.valueOf(a); // boxing : wrapper
		
		//primitive to Wrapper
		float f= 12.09f;
		Float f1 = Float.valueOf(12.09f);
		
		//float d = f.floatValue(); //unboxing : unwrapping 
		
		//float fd=f; //autounboxing : autowrapping
		
		System.out.println(a+" "+i+" "+j);
		System.out.println(f+" "+f1);
		

	}

}
