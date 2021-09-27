package JDk8;

@FunctionalInterface
interface Inter3{
	void m1();
		
	}

class Myclass{
	
	Myclass(){
		System.out.println("This is constructor");
	}
}


public class MRWithConstructor {

	public static void main(String[] args) {
		
		Inter3 i=Myclass::new;
		i.m1();
	}

}
