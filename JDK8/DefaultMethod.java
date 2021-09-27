package JDk8;

interface I{
	
	void show();
	void dislay();
	
	default void m1() {
		System.out.println("This is m1 method");
	}
	
	static void m2() {
		System.out.println("this is ststic method");
	}
}
class Demo implements I{

	@Override
	public void show() {
		System.out.println("This is show method of demo class");
		
	}

	@Override
	public void dislay() {
		System.out.println("this is display method of demo class");
		
	}
	public static void m2() {
		System.out.println("This is ststic method of demo class");
	}
	
}

public class DefaultMethod implements I {

	public static void main(String[] args) {
		
		I i=new DefaultMethod();
		i.show();
        i.dislay();
        i.m1();
        
        I.m2();
        Demo.m2();
	}

	@Override
	public void show() {
		System.out.println("This is show method");
		
	}

	@Override
	public void dislay() {
		System.out.println("this is dislay method");
		
	}

}
