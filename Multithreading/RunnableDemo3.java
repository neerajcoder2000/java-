class MyThread4 implements Runnable{
	
	public void run() {
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		System.out.println("I am a thread 4 not a thread 4");
		
	}
}

class MyThread5 implements Runnable{
	
	public void run() {
		System.out.println("I am a thread 5 not a thread 5");
		System.out.println("I am a thread 5 not a thread 5");
		System.out.println("I am a thread 5 not a thread 5");
		System.out.println("I am a thread 5 not a thread 5");
		System.out.println("I am a thread 5 not a thread 5");
		System.out.println("I am a thread 5 not a thread 5");
		System.out.println("I am a thread 5 not a thread 5");
		System.out.println("I am a thread 5 not a thread 5");
		System.out.println("I am a thread 5 not a thread 5");
		System.out.println("I am a thread 5 not a thread 5");
		System.out.println("I am a thread 5 not a thread 5");

		

	}
}
public class RunnableDemo3 {

	public static void main(String[] args) {
		MyThread4 m1= new MyThread4();
		Thread t1 = new Thread(m1);
		
		MyThread5 m2= new MyThread5();
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
		

	}

}
