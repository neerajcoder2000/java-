package JDk8;
@FunctionalInterface
interface Addition{
	
	int add(int a, int b);
}
@FunctionalInterface
interface I2{
	void show(int a);
}

public class Lambda2 {

	public static void main(String[] args) {
		
		//with datatype
		Addition a1=(int x, int y)->{
			
			int sum=x+y;
			System.out.println("sum : "+sum);
			return x;
		};
			a1.add(30, 40);
			
			//without datatype
			Addition a2=(x,y)->{
				
				int sum=x+y;
				System.out.println("sum : "+sum);
				return x;
		};
		   a2.add(40, 50);
		   
		   //With using return ststement
		   Addition a3=(x,y)->{
			   
			   return (x+y);
		   };
		   System.out.println("Add : "+a3.add(50, 60));
		   
		   //With another interface
		   I2 i=(a)->{
			   System.out.println("This is show method");
		   };
		   i.show(20);
		   
		   //Without paranthesis
		   I2 i2=a->{
			   System.out.println("This is show method without paranthesis");
			   
		   };
		   i2.show(40);
		   
		   
		   //Without brackets-----------if there one statement
		   I2 i3=a->System.out.println("This is show method without paranthesis");
		   
		//   System.out.println("This is second ststement");
		   i2.show(30);
		
	}

}
