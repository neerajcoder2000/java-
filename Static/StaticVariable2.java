package Day1;

class Demo{
	 int a=1; ///a=2
	static int b=1;
	
	Demo(){
		a++; //2 ,2
		b++; //2 ,4
	}
	public void show() {
		System.out.println(++a); //3 
		System.out.println(--b); //3 ,5
	}
	
}

public class StaticVariable2 {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.show();
		
		Demo d1 = new Demo();
		d1.show();
		
		

		}

}
