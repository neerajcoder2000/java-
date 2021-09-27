package day1;

public class ThrowDemo2 {
	
	public void divide(int a,int  b) throws ArithmeticException,Exception{
		
		try {
		int div = a/b;
		
		System.out.println("Div: "+div);
	 }
		catch(ArithmeticException e) {
		e.printStackTrace();
			}
		System.out.println(a);
	}

	public static void main(String[] args) throws ArithmeticException, Exception {
		
		ThrowDemo2 t = new ThrowDemo2();
		t.divide(10, 0);
		

	}

}
