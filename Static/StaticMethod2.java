package Day1;

class Test{
	
	String username;
	
	public static void sayHello(){
		
		System.out.println("Hello.....");
		
	}
		
	public void sayHelloTouser() {
		System.out.println("Hello....."+username);
		
	}
	public static void sayBye() {
		System.out.println("Bye.....");
		
	}
}
	public class StaticMethod2 {

	public static void main(String[] args) {
		
		Test.sayHello();
		
       Test t = new Test();
       t.username="Nitesh";
       t.sayHelloTouser();
       
       Test t1 = new Test();
       t1.username="Nidhi";
       t1.sayHelloTouser();
       
       Test.sayBye();
	}

}
