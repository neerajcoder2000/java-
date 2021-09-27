package Day1;

class Demo1{
	
	static {
		System.out.println("This is static block");
		
	}
	Demo1(){
		System.out.println("This is constructor");
	}
	static {
		System.out.println("This is static 2");
	}
	{
		System.out.println("This is IIB");
		
	}
	{
		System.out.println("This is IIB2");
	}
}

public class StaticBlock {
	
	static {
		System.out.println("static");
	}

	public static void main(String[] args) {
		
		Demo1 d= new Demo1();
		Demo1 d1= new Demo1();


	}

}
