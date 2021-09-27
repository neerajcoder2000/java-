interface I1{
	void show();
}

interface I2{
	void display();
}

class Demo implements I1,I2{

	@Override
	public void display() {
		System.out.println("display");
		
		
	}

	@Override
	public void show() {
		System.out.println("show");
		
	}
	
}


public class InterfaceDemo2 {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.show();
		d.display();
		
	}

}
