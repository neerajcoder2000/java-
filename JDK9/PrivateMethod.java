package JDK9;

interface I{
	
	default void m1() {
		System.out.println("This is m1 method");
	}
	default int m2() {
		System.out.println("This is m2 method");
		return m3();
		
	}
	
	private int m3() {
		System.out.println("This is private m3 method");
		return 20;
	}
	static String show() {
		System.out.println("This is static show method");
		return display();
	}
	
	private static String display() {
		System.out.println("This is private dispaly method");
		return "hi";
	}
}

public class PrivateMethod implements I {

	public static void main(String[] args) {
		
		I i=new PrivateMethod();
		i.m1();
		i.m2();
		//i.m3();
		I.show();
		
	}

}
