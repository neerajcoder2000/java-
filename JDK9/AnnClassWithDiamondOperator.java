package JDK9;

abstract class Demo<O>{
	
	abstract O add(O a, O b);
}

public class AnnClassWithDiamondOperator {

	public static void main(String[] args) {
		
		Demo<Integer> d=new Demo<Integer>() {

			@Override
			Integer add(Integer a, Integer b) {
				
				return a+b;
			}
		};
		System.out.println("Addition: "+d.add(40, 50));

		Demo<String> d1=new Demo<String>() {

			@Override
			String add(String a, String b) {
				
				return a+b;
			}
		};
		System.out.println("Addition: "+d1.add("Hello" , " MAp"));
 }
}