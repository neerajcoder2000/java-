package day2;

class shape{
	
	String name="I am shape";
	
	shape() {
		System.out.println("This is shape constructor");
		
		}
	public void show() {
		System.out.println("This is show method of shape ");
	}
}

class Circle extends shape {
	
	String name="This is circle";
	
	Circle() {
		//constructor
		super();
		//variable
		System.out.println("super name: "+super.name);
		System.out.println("This is constructor of circle");
	}
	
	public void show() {
		super.show();
		 System.out.println("This is method of circle");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		System.out.println("Name: "+c.name);
		c.show();

	}

}
