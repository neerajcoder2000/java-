package day2;

class Vehicle1 {
	
	protected Integer run() {
		System.out.println("Vehicle is Running");
		return 10;
	}
}

class Car1 extends Vehicle1 {
	
	@Override
	public Integer run() {
		System.out.println("Car is Running");
		return 10;
	}
}

public class MethodOverRiding {

	public static void main(String[] args) {
		
		Car1 c = new Car1();
		c.run();
		
		

	}

}
