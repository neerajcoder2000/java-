
public class WrapperDemo3 {

	public static void main(String[] args) {
		
		//wrapper to primitive
		Float f = new Float(12.9);
		
		float f1 = f.floatValue();
		
		//wrapper to primitive autowrapping
		float j=f;
		
		System.out.println(f+" "+f1+" "+j);
		
		
		
		
		
		//primitive to wrapper
		char c = 'a';
		
		Character ch = new Character(c);
		//primitive to wrapper autowrapping 
		
		char j1 = 'a';
		
		System.out.println(c+" "+ch+" "+j1);
		
		
		
		
		
		
			}

}