interface I{
	
	void show();
	void display();
	
	}
abstract class Myclass implements  I{
	
	/*abstract class have concrete and abstract method
	 * interface provide full abstraction
	 * 
	 */

	@Override
	public void show() {
		System.out.println("This is show method");
		
		
	}

	@Override
	public void display() {
		System.out.println("This is display method");
		
			}
}


class Myclass2 extends Myclass{
	
	public void show() {
		System.out.println("This is show method");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Myclass m= new Myclass2();
		m.show();
		m.display();
		
		
	}

}
