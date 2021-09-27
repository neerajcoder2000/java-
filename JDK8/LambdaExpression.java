package JDk8;
@FunctionalInterface
interface Person{
	
	void eat();
}
@FunctionalInterface
interface I1{
	String display();
	
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		int calories=50;
		
		//without lambda with anonymous class
		Person p=new Person() {

			@Override
			public void eat() {
				
				System.out.println("This is eat method");
				
			}
			
		};
		p.eat();
		
		//with lambda
		Person p1=()->{System.out.println("Calories: "+calories);};
         
		p1.eat();
		
		System.out.println("-------------------------");
		
		//for second interface
		I1 i=()->{
			System.out.println("This is lambda expresion example");
			
			return "coder";		
			};
			i.display();
			System.out.println("-----------------------");
			System.out.println(i.display());
			
			
			I1 i1=()->{
				System.out.println("This is lambda second object");
				return "squad";			
				};
				System.out.println(i1.display());
			
	}

}
