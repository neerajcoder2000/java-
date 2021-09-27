package day1;

class Myclass{
	
	int a=10,b=0;
	
	public void m1() {
		int div=a/b;
		System.out.println("div:"+div);
	}
	
	public void m2() {
		m1();
	}
	public void m3() {
		try {
			m2();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

public class ExceptionPropagation {

	public static void main(String[] args) {
		
		Myclass m= new Myclass();
		m.m3();
	
		

	}

}
