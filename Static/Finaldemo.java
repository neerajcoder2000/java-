package Day1;

 class circle{
	float radius;
	float pi=3.14f;
	float area;
	
	public void area() {
		area = radius*radius*pi;
		System.out.println("area: "+area);
	}
}

public class Finaldemo {

	public static void main(String[] args) {
		
		circle c = new circle();
		c.radius = 10;
		c.area();
		
		circle c1 = new circle();
		c1.radius = 20;
		c1.area();
		
		
		
		

	}

}
