package day1;

class Vehicle1 {
	protected Number run() {
		System.out.println("Vehicle is running");
		return 10;
	}
}

class Car1 extends Vehicle1 {
	
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
