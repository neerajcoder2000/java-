
interface Outer{
	void m1();
	
interface Inner{
	void m2();
	}
}

public class NestedInterface implements Outer.Inner {

	public static void main(String[] args) {
		
		NestedInterface n = new NestedInterface();
		n.m2();
	}

	@Override
	public void m2() {
		System.out.println("m2");
		
	}
}	