interface Parent1{
	void m1();
	
}

//Extended Interface
interface Parent2 extends Parent1{
	void m2();
	
}

class C1 implements Parent2{

	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	@Override
	public void m1() {
		System.out.println("m1");
		
	}
	
}
public class InterfaceDemo4 {
	
	public static void main(String[] args) {
		
		C1 c= new C1();
		c.m1();
		c.m2();

		}
	

}
