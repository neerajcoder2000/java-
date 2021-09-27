package day2;

public class MethodOverloadingDemo {
	
	public void area(double r) {
		double area= 3.14*r*r;
		System.out.println("Circle: "+area);
	}
	
	String area(int l,double b) {
		double area=l*b;
		System.out.println("Rectangle: "+area);
		return "Hello";
	}
	
	protected double area(double l,int b) {
		double area= l*b;
		System.out.println("Rectangle: "+area);
		return 10;
	}
	
	private void area(int s) {
		double area= s*s;
		System.out.println("square: "+area);
		
	}

	public static void main(String[] args) {
		
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		
		Demo d = new Demo();
		d.area(10, 20);

	}

}

class Demo extends MethodOverloadingDemo {
	public void area(int a,int b) {
		
		int area= a*b;
		System.out.println("area: "+area);
	}
}
