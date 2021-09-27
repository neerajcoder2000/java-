interface A{
	void m1(); // abstraction hai or public default
	
}

interface B{
	void m2();
	
}

class C implements A{

	@Override
	public void m1() {
		System.out.println("m1");
		
	}
	
}

class D extends C implements B{

	@Override
	public void m2() {
		System.out.println("m2");
		
	}
	
}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		
		D d=new D();
		d.m1();
		d.m2();

	}

}
