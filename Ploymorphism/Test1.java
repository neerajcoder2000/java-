package day1;

public class Test1 extends Addition{
	
	public static void main(String[] args) {
		
		Addition a = new Addition();
		a.addToInt(10, 20);
		a.addToFloat(20.5f, 30.4f);
		
		Test1 t = new Test1();
		t.addToInt(14, 20);
		t.addToFloat(57.f ,45.6f );
		

	}

}
