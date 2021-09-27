interface I3{
	void show();
}

abstract class Test implements I3{
	
	
}
public class InterfaceDemo5 extends Test {

	public static void main(String[] args) {
		I3 i = new InterfaceDemo5();
		i.show();
		
		InterfaceDemo5 i2 = new InterfaceDemo5();
        i2.show();
	}

	@Override
	public void show() {
		System.out.println("show");
	}

}
