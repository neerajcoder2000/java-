package day1;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
	try {
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for(int i=0;i<=a.length;i++) {
			System.out.println(a[i]);
		}
	}
		catch(Exception e) {
		System.out.println(e);
	}
		System.out.println("--------------------");
		System.out.println("a[0] ="+a[0]);
		


	}

}
