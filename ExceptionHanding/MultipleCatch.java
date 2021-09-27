package day1;

public class MultipleCatch {
	
	public void test() {
		
int a[]=new int[5];
		
		try {
			a[0]=10;
			a[1]=20;
			a[2]=30;
			a[3]=0;
			a[4]=50;
			
			try {
				
			a[5]=a[2]/a[3];
			System.out.println("a[5]: "+a[5]); 
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.println(a[0]);
			System.out.println(a[1]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		} 
		catch(ArithmeticException aie) {
			System.out.println(aie);
		}
		catch(RuntimeException re) {
			System.out.println(re);
		}
		
		System.out.println("----------------------------");
		

	}
	public static void main(String[] args) {
		
		MultipleCatch m= new MultipleCatch();
		m.test();
		
		
}
}
