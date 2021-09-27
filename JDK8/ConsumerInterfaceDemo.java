package JDk8;

import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		
		System.out.println(t);
		
	}
	
}

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		
		//By Inheritance
		MyConsumer m=new MyConsumer();
		m.accept(50);
		
		System.out.println("--------------------------");
		//By Lambda String
		Consumer<String> c=t->{
			System.out.println(t);
		};
		c.accept("Hello");
		//By Lambda Integer
		System.out.println("----------------------------");
		Consumer<Integer> c2=t->{
			System.out.println(t);
		};
		c2.accept(60);
		
		System.out.println("-----------------------");
		
		
		//Vote
		Consumer<Integer> c1=t->{
			
			if(t>=18) {
				System.out.println("Your are eligible for vote");
			}
			else {
				System.out.println("Your are not eligible for vote ");
			}
		};
		c1.accept(20);
		
 
	}

}
