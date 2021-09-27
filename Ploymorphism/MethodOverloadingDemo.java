package day1;

public class MethodOverloadingDemo {
	
	public int area(double r) {
		
		double area = 3.14*r*r;
		System.out.println("circle :"+ area);
		return 10;
	}
	
	String area(int a, double b) {
		
		double area = a*b;
		System.out.println("Rectangle :"+area);
		return "Hello";
		
	}
	
	protected double area(double a, int b) {
		double area = a*b;
		System.out.println("Rectangle :"+ area);
		return 10;
	}
	
	private void area(int s) {
		double area = s*s;
		System.out.println("Square :" + area );
	}

	public static void main(String[] args) {
		
		MethodOverloadingDemo mod = new MethodOverloadingDemo();
	
		Demo d =new  Demo();
		d.area(10, 20);
		d.area(45);
		

	}

}
