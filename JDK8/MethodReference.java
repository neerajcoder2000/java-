package JDk8;

@FunctionalInterface
interface Inter{
	void m1();
}
@FunctionalInterface
interface Inter2{
	void m2(int a);
}

class Demo1{
	
	void show() {
		System.out.println("This is show method");
	}
	
	static void show(int a) {
		System.out.println("this is parametrised show method");
	}
}

public class MethodReference {

	public static void main(String[] args) {
		
		Demo1 d=new Demo1();
		
		//with lambda
		Inter i=()->{
			
			d.show();
		};
		i.m1();
		
		//with method reference
		Inter i1=d::show;
		i1.m1();
		
	//	Inter2 i2=d::show;
	//	i2.m2();
		
		
		Inter2 i2=Demo1::show;
		i2.m2(20);
		
		

	}

}
